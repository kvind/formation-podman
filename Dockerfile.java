FROM ubuntu:latest

RUN apt update && apt install -y wget openjdk-17-jdk maven

WORKDIR /app

COPY ./demo .


RUN pwd
RUN ls
# compilation de l'app
RUN mvn clean package

CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080