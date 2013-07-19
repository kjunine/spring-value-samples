package net.kjunine.sample.value;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleValueBeanByAnnotation {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Value("#{'${sample.name:Default Name}'}")
	private String name;

	@Value("#{'${sample.test:Default Test}'}")
	private String test;

	@Value("#{${sample.no:1}}")
	private int no;

	@Value("#{${sample.value:10.0}}")
	private double value;

	@Value("#{${sample.flag:true}}")
	private boolean flag;

	@PostConstruct
	public void initialize() {
		logger.info("A sample bean by annotation has initialized.");
		logger.info("Sample name: " + name);
		logger.info("Sample test: " + test);
		logger.info("Sample no: " + no);
		logger.info("Sample value: " + value);
		logger.info("Sample flag: " + flag);
	}

}
