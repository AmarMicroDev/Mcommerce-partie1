FROM openjdk:8
EXPOSE 9090
ADD target/microcommerce-0.0.1-SNAPSHOT.jar microcommerce-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/microcommerce-0.0.1-SNAPSHOT.jar"]