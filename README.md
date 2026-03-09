# Demo Java Microservice

This is a simple Java microservice built with Spring Boot that exposes an API endpoint.

## API Endpoint

- GET /hello - Returns "Hello World"

## Building the Application

To build the application, run:

```bash
mvn clean package
```

This will create a JAR file in the `target` directory.

## Running the Application

To run the application locally:

```bash
java -jar target/demo-java-microservice-0.0.1-SNAPSHOT.jar
```

The application will start on port 8080 by default.

## Deployment on Azure VM

1. Build the JAR as described above.
2. Transfer the JAR to your Azure VM.
3. Ensure Java 17+ is installed on the VM.
4. Run the JAR with `java -jar demo-java-microservice-0.0.1-SNAPSHOT.jar`.
5. Optionally, configure it to run as a service or use a process manager like systemd.

Make sure the VM's firewall allows traffic on port 8080.