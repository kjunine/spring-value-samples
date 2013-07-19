package net.kjunine.sample.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleValueMain {

	static {
		System.setProperty("spring.profiles.default", "development");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SampleValueConfig.class);
		context.registerShutdownHook();
	}

}
