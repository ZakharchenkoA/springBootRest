FROM openjdk:11-jdk-alpine
EXPOSE 8080
ADD springBootRest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
