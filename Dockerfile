####
# This Dockerfile is used in order to build a container that runs the Spring Boot application in JVM mode
#
# Before building the docker image run:
#
# mvn package
#
# Then, build the image with:
#
# docker build -f Dockerfile -t commerce-spring-boot .
#
# Then run the container using:
#
# docker run -i --rm -p 7070:7070 commerce-spring-boot
#
###
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 7070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ADD target/microcommerce-0.0.1-SNAPSHOT.jar microcommerce-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/microcommerce-0.0.1-SNAPSHOT.jar"]