package app.truecaller.resources;

import java.util.Queue;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.truecaller.facade.HolderFacade;
import app.truecaller.models.History;


import com.codahale.metrics.annotation.Timed;

/**
 * Class resource get REST API /history
 * 
 * @author Ogarkov.Sergey
 *
 */
@Path("/history")
@Produces(MediaType.APPLICATION_JSON)
public class HistoryResource {

	final static Logger logger = LoggerFactory.getLogger(HistoryResource.class);

	private HolderFacade holderFacade = InitSpring.CTX.getBean("holderFacade",
			HolderFacade.class);

	@GET
	@Timed
	public Queue<History> getHistory(@QueryParam("id") int id) {
		logger.debug("Params /history: id=" + id);
		return holderFacade.getHistory(id);
	}

	
	 @GET	  
	 @Path("/count")
	 public Long getCountHistory() { 
	  return holderFacade.getCountHistory(); 
	 }
	 
}
