# Use a lightweight OpenJDK image
FROM eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the built jar file (adjust the name as needed)
COPY target/timertask-backend-*.jar app.jar

# Run the CLI app by default (can be overridden)
ENTRYPOINT ["java", "-jar", "app.jar"]
