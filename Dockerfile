# Use a Java 21 base image
FROM eclipse-temurin:21-jre

# Set a directory inside container
WORKDIR /app

# Copy jar
COPY target/greeting-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port (optional)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]
