# Microservice Architecture with Full Observability Stack

This project demonstrates the implementation of a modern microservices architecture using Spring Boot and Spring Cloud technologies, enhanced with comprehensive observability using Prometheus, Grafana, and OpenTelemetry

---

## Architecture Overview

### Core Components

1. **Spring Cloud Gateway**:
   - Serves as the single entry point for clients.
   - Routes requests to the appropriate microservices.

2. **Eureka Server (Service Registry)**:
   - Facilitates service registration and discovery.
   - Enables dynamic service scaling.

3. **Config Service**:
   - Manages centralized configuration for all microservices.

4. **Microservices**:
   - **Customer Service**:
     - Handles customer-related operations.
     - Communicates with the `Bank Account Service` using **OpenFeign**.
   - **Bank Account Service**:
     - Manages customer bank accounts.
     - Provides data to the `Customer Service`.

5. **Clients**:
   - External clients interact with the system via the API gateway.

---

### Observability Stack

5. **Prometheus**:
   - Collects and stores metrics from all services
   - Powerful query language for metric analysis

6. **Grafana**:
   - Rich visualization and dashboarding platform
   - Displays metrics, traces, and logs in unified views

7. **OpenTelemetry Collector**:
   - Centralized telemetry data collection
   - Supports multiple exporters and protocols

8. **Jaeger**:
   - Distributed tracing system
   - Visualizes request flows across microservices

---

## Features

- **Service Discovery**: Microservices register with Eureka for dynamic discovery and load balancing.
- **Centralized Configuration**: Configurations are fetched from a central repository by the Config Service.
- **API Gateway**: Routes external requests to the respective services while enabling cross-cutting concerns like rate limiting.
- **Inter-service Communication**: Microservices communicate via REST using **OpenFeign**.

---

## Prerequisites

- Java 17+
- Maven or Gradle
- Spring Boot 3.x
- IDE (e.g., IntelliJ IDEA or Eclipse)

---

## Running the Application

### Steps

1. **Start Eureka Server**:
   - Navigate to the `eureka-server` module and run `EurekaServerApplication.java`.

2. **Start Config Service**:
   - Ensure a configuration repository is set up (e.g., GitHub/Local).
   - Navigate to the `config-service` module and run `ConfigServiceApplication.java`.

3. **Start Microservices**:
   - Run `CustomerServiceApplication.java` and `BankAccountServiceApplication.java` in their respective modules.
   - Verify that each service is registered in the Eureka dashboard.

4. **Start Spring Cloud Gateway**:
   - Navigate to the `gateway-service` module and run `GatewayServiceApplication.java`.

5. **Access the Application**:
   - **API Gateway**: `http://localhost:<gateway-port>`
   - **Eureka Dashboard**: `http://localhost:<eureka-port>`
   - **Microservices**: Access individual services through the gateway.

---

## Project Structure

```plaintext
.
├── eureka-server
├── config-service
├── gateway-service
├── customer-service
├── bank-account-service
└── README.md
