# Spring Boot User Directory Application

This is a simple Spring Boot application that provides an API to create user home directories in the filesystem based on a user ID. The directory structure is organized as `/opt/user/<userid>`.

## Features

- Create user home directories via a RESTful API.
- Directory creation is handled in the filesystem.

## Prerequisites

- Java 11 or higher
- Maven

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   cd spring-boot-userdir-app
   ```

2. Build the application using Maven:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. The application will start on port 8080.

## Usage

To create a user home directory, send a POST request to the following endpoint:

```
POST http://localhost:8080/userdir/create
```

### Request Body

```json
{
  "userId": "<userid>"
}
```

### Example

To create a directory for user `john_doe`, you would send:

```
POST http://localhost:8080/userdir/create
```

With the following JSON body:

```json
{
  "userId": "john_doe"
}
```

This will create a directory at `/opt/user/john_doe`.

## License

This project is licensed under the MIT License.