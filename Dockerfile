FROM alpine:3.13
RUN apk add openjdk11
COPY target/messenger.jar /messenger.jar
ENTRYPOINT ["java", "-jar", "/messenger.jar"]
