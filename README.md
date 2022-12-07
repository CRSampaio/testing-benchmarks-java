# Testing Benchamrks with Java

Hi! In this repo, I'm learning how to use the JMH library to benchmark my codes and applications. Also, I've learned how to use the Maven CLI / Maven API to create a new Java project

## Creating a new Java project using Maven CLI

To create a new Java project using Maven, we can run:  

    mvn -B archetype:generate -DgroupId=org.crsampaio -DartifactId=testing-benchmarks-java -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=RELEASE

Alrigth, now let's break this down:
  - **mvn =** Maven executable
  - **-B =** It's telling Maven to run the command in batch mode (ot quiet mode)
  - **archetype:generate** = This is our goal, i.e. 
  - **-D{someValue}**
  - **-DarchetypeArtifactId=maven-archetype-quickstart**