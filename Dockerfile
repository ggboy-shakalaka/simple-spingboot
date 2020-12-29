FROM openjdk:8-jdk-alpine
WORKDIR /home
EXPOSE 80
COPY target/*.jar /home
ENTRYPOINT java -jar *.jar