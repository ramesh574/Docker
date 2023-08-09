FROM openjdk:17-alpine
WORKDIR /app
COPY ./target/start-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","start-0.0.1-SNAPSHOT.jar"]