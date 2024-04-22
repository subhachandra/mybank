FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/mybank-0.0.1-SNAPSHOT.jar demp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]