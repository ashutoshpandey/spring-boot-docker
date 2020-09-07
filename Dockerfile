FROM java:8

ADD target/docker-spring-boot-01.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app.jar"]
