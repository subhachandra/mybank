FROM eclipse-temurin:17-jdk-alpine
COPY /target/mybank-0.0.1-SNAPSHOT.jar mybank-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","mybank-0.0.1-SNAPSHOT.jar"]