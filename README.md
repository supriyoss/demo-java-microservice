# Demo Java Microservice

This is a simple Java microservice built with Spring Boot that exposes an API endpoint.

## API Endpoints

- GET / - Returns a "Hello World" homepage (HTML)
- GET /hello - Returns "Hello World" as JSON

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

The application will start on port 3500 by default.

## Deployment on Azure VM

1. Build the JAR as described above.
2. Transfer the JAR to your Azure VM.
3. Ensure Java 17+ is installed on the VM.
4. Run the JAR with `java -jar demo-java-microservice-0.0.1-SNAPSHOT.jar`.
5. Optionally, configure it to run as a service or use a process manager like systemd.

Make sure the VM's firewall allows traffic on port 3500.

## Deployment on Azure Container Apps

The application can be deployed to Azure Container Apps using the provided Azure DevOps pipeline (`deploy-to-aca.yml`).

### Automated Deployment

1. Ensure the Azure DevOps pipeline is configured with the necessary service connections:
   - Docker Hub connection (`Dockerhub-connect`)
   - Azure service connection (`azure-sp`)

2. Trigger the pipeline manually or set up triggers as needed.

3. The pipeline will:
   - Build the application using Maven
   - Create a Docker image and push it to Docker Hub
   - Deploy the container to Azure Container Apps

### Container App Configuration

- **Container App Name**: java-app
- **Resource Group**: techish-app-rg
- **Environment**: java-microservice-env
- **Location**: Central India
- **Target Port**: 3500
- **Ingress**: External

The application will be accessible via the Azure Container Apps URL once deployed.