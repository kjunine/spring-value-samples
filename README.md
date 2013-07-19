Spring @Value Samples
=====================

### How to Run ###

Build with maven and run the jar file.

	mvn clean package
	java -jar target/spring-value-samples-0.1.0.jar

Or if you are using IDE like eclipse, just run the main class.

	net.kjunine.sample.value.SampleValueMain

#### VM argument options ####

You can pass VM arguments to enable different mode. Compare result between these mode:

* Development

	// nothing

* Standard

	-Dspring.profiles.active=standard -Dsample.home=config

* System

	-Dspring.profiles.active=standard -Dsample.home=config "-Dsample.name=System Name" "-Dsample.test=System Test" -Dsample.no=4 -Dsample.value=40.0 -Dsample.flag=false

