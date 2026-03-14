FROM eclipse-temurin:17-jdk-ubi9-minimal

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]