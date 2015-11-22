package app.truecaller.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.truecaller.core.TruecallerSpringConfiguration;

/**
 * Class init spring context
 * 
 * @author Ogarkov.Sergey
 *
 */
public abstract class InitSpring {

	final static Logger logger = LoggerFactory.getLogger(InitSpring.class);

	public static ApplicationContext CTX = new AnnotationConfigApplicationContext(
			TruecallerSpringConfiguration.class);

}
