package app.truecaller.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.truecaller.facade.HolderFacade;
import app.truecaller.models.Profile;

import com.codahale.metrics.annotation.Timed;

/**
 * Class resource get REST API /profile
 * 
 * @author Ogarkov.Sergey
 *
 */
@Path("/profile")
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	final static Logger logger = LoggerFactory.getLogger(ProfileResource.class);

	private HolderFacade holderFacade = InitSpring.CTX.getBean("holderFacade",
			HolderFacade.class);

	@GET
	@Timed
	public Profile getProfile(@QueryParam("guest") int guest,
			@QueryParam("id") int id) {
		logger.debug("Params /profile: guest= " + guest + ", id=" + id);
		return holderFacade.getProfile(guest, id);
	}
}
