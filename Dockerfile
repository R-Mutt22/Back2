
FROM amazoncorretto:17-alpine-jdk
MAINTAINER matiaszelarayan
COPY target/miPorfolioApp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
