package net.kjunine.sample.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("net.kjunine.sample.value")
@ImportResource("classpath:/net/kjunine/sample/value/context.xml")
public class SampleValueConfig {

	/**
	 * MUST configure this to use ${...} placeholders within @Value annotation.
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Configuration
	@Profile("development")
	@PropertySource("classpath:/net/kjunine/sample/value/development.properties")
	static class Development {

	}

	@Configuration
	@Profile("standard")
	@PropertySource("file:${sample.home}/sample.properties")
	static class Standard {

	}

}
