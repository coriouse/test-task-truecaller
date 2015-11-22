package app.truecaller.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Configuration spring class
 * 
 * @author Ogarkov.Sergey
 *
 */
@Configuration
@ImportResource("classpath:spring/root-context.xml")
@ComponentScan(basePackageClasses = TruecallerSpringConfiguration.class)
public class TruecallerSpringConfiguration {

}
