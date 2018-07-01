FROM openjdk:8-jre
COPY target/demo_springboot_docker-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]