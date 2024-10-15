FROM openjdk:21-slim as build
MAINTAINER Tolulope_Oredein
COPY target/paystack-integration-0.0.1-SNAPSHOT.jar paystack-integration-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/paystack-integration-0.0.1-SNAPSHOT.jar"]
