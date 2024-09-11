# Payment System - Spring Boot Project

## Project Specifications

This project is a RESTful API built with **Spring Boot** and **MongoDB** to manage products and promotions. The application uses **Java 17** and **Maven** as the build tool.

### Project Information
- **Framework**: Spring Boot 3.3.3
- **Build Tool**: Maven
- **Language**: Java 17
- **Database**: MongoDB (NoSQL)

### Dependencies Used:
- **Spring Boot Starter Data MongoDB**: For MongoDB database integration.
- **Spring Boot Starter Web**: For building the REST API.
- **Lombok**: To reduce boilerplate code (getters, setters, etc.).

## Database Configuration

The project uses MongoDB as the NoSQL database. To run MongoDB via Docker, execute the following command to create the container:

```bash
docker run -d --name mongodb-container -p 27017:27017 \
  -e MONGO_INITDB_ROOT_USERNAME=admin \
  -e MONGO_INITDB_ROOT_PASSWORD=password \
  mongo:latest
```

After creating the container, it is recommended to use **MongoDB Compass** or any other GUI tool of your choice to view the data being transacted in the database.

### Connection Settings

The database connection settings are defined in the `application.yml` file:

```yaml
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: productdb
      username: admin
      password: admin
```

> **Note**: The database must be running for the project to build and run correctly.

## Build and Run Instructions

To download all dependencies and build the project, run the following command:

```bash
mvn clean install -DskipTests=true
```

This command will compile the project and skip running the tests.

## API Endpoints

Below are the main available endpoints in the API:

### Required Endpoints

#### 1. Product Insertion

- **Method**: `POST`
- **Route**: `/products`
- **Description**: Inserts a new product into the database.

#### 2. Insert Promotions for Products

- **Method**: `POST`
- **Route**: `/promotions/{productId}`
- **Description**: Inserts a promotion associated with a specific product.

### Additional Endpoints

#### 3. Bulk Product Insertion

- **Method**: `POST`
- **Route**: `/products/bulk`
- **Description**: Inserts multiple products in bulk.

#### 4. Retrieve All Products

- **Method**: `GET`
- **Route**: `/products`
- **Description**: Returns all registered products and promotions.

#### 5. Retrieve Products Without Promotions

- **Method**: `GET`
- **Route**: `/products/nopromotions`
- **Description**: Returns all products that do not have associated promotions.

#### 6. Retrieve Product by ID

- **Method**: `GET`
- **Route**: `/products/{id}`
- **Description**: Returns the information of a specific product by its ID.

## API Documentation

The full API documentation can be accessed through Swagger UI at the following address:

[http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

---

### Author

Project developed by Leandro Bernardo for managing products and promotions in a payment system.
