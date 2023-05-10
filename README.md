# Labseq

This is a simple Spring Boot application that calculates the Labseq value for a given positive integer value. The application exposes an endpoint `/labseq/{value}` that accepts a non-negative integer value and returns its Labseq value.

## Running the Application

To run the application, you can use the following command:

```
mvn spring-boot:run
```

After running the command, you can access the Swagger UI at `http://localhost:8080/swagger-ui.htm`. The endpoint `/labseq/{value}` can be accessed from there.

## Application Structure

The application consists of the following classes:

- `LabseqController`: Exposes the `/labseq/{value}` endpoint and delegates the calculation to the `LabseqService`.
- `LabseqService`: Contains the business logic for calculating the Labseq value for a given non-negative integer value.
- `LabseqCalculator`: A utility class that contains static methods used to calculate Labseq values for given input values.
- `Constants`: A utility class that contains constant values used throughout the application.
- `ResourceExceptionHandler`: A controller advice class that handles `IllegalArgumentException` exceptions thrown by the application and returns a standardized error response.
- `WebConfig`: A configuration class that enables Cross-Origin Resource Sharing (CORS) for the application.
- `SwaggerConfig`: A configuration class that enables Swagger UI for the application.
- `DataLoader`: A component class that preloads the cache with Labseq values up to 10,000.

In addition to these classes, there are several test classes that test the functionality of the application:

- `LabseqControllerTests`: Unit tests for the `LabseqController` class.
- `LabseqServiceTests`: Unit tests for the `LabseqService` class.
- `LabseqCalculatorTests`: Unit tests for the `LabseqCalculator` class.
- `LabseqIntegrationTests`: Integration tests for the application.

## Preloading Cache

To avoid calculating the same Labseq values repeatedly, the `DataLoader` component preloads the cache with Labseq values up to 10,000. This improves the performance of the application by reducing the number of calculations required.

## Handling Exceptions

The application throws an `IllegalArgumentException` if the input value is null or negative. The `ResourceExceptionHandler` class handles this exception and returns a standardized error response with an appropriate HTTP status code.

## Swagger UI

The application uses Swagger UI to provide documentation and an interactive interface for the `/labseq/{value}` endpoint. You can access the Swagger UI at `http://localhost:8080/swagger-ui.htm`.