FROM openjdk:17-oracle
WORKDIR /app
COPY ../target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
