FROM maven:3.8.3-openjdk-17 as builder

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN  mvn package -DskipTests

FROM openjdk:17.0-jdk-slim

COPY --from=builder /app/target/cronapp-0.0.1-SNAPSHOT.jar /cronapp.jar

ENTRYPOINT ["java","-jar","cronapp.jar"]