package net.kjunine.sample.value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleValueBeanByXml {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private String name;
	private String test;
	private int no;
	private double value;
	private boolean flag;

	public void setName(String name) {
		this.name = name;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void initialize() {
		logger.info("A sample bean by xml has initialized.");
		logger.info("Sample name: " + name);
		logger.info("Sample test: " + test);
		logger.info("Sample no: " + no);
		logger.info("Sample value: " + value);
		logger.info("Sample flag: " + flag);
	}

}
