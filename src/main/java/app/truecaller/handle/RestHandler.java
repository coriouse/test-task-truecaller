package app.truecaller.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import app.truecaller.resources.HistoryResource;

/**
 * 
 * Class implementation of rest sending History
 * 
 * @author Ogarkov.Sergey
 *
 */
@Component("REST")
public class RestHandler implements Handler {

	final static Logger logger = LoggerFactory.getLogger(HistoryResource.class);

	public void handle() {
		// TODO implement rest interface for forwarding data

	}

}
