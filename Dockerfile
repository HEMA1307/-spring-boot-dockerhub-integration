FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-dockerhub-integration.jar spring-boot-dockerhub-integration.jar
ENTRYPOINT ["java","-jar","spring-boot-dockerhub-integration.jar"]