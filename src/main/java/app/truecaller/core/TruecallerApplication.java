package app.truecaller.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import app.truecaller.resources.HistoryResource;
import app.truecaller.resources.ProfileResource;
import app.truecaller.services.HolderProfile;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Entry point class
 * 
 * @author Ogarkov.Sergey
 *
 */
public class TruecallerApplication extends Application<TruecallerConfiguration> {

	final static Logger logger = LoggerFactory.getLogger(HolderProfile.class);

	public static void main(String[] args) throws Exception {
		//DEBUG
		/*new TruecallerApplication().run(new String[] {
				"server",
				TruecallerApplication.class.getClassLoader()
						.getResource("config.yaml").getPath() });*/
		//PROD
		new TruecallerApplication().run(args);
	}

	@Override
	public String getName() {
		return "truecaller";
	}

	@Override
	public void initialize(Bootstrap<TruecallerConfiguration> bootstrap) {
		// register configuration, environment and placeholder
	}

	@Override
	public void run(TruecallerConfiguration configuration,
			Environment environment) throws Exception {
		final ProfileResource profileResource = new ProfileResource();
		environment.jersey().register(profileResource);
		final HistoryResource historyResource = new HistoryResource();
		environment.jersey().register(historyResource);
	}

}
