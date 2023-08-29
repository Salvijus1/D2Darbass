Product Management Web Service
The Product Management Web Service is a simple Java web application for managing product information and reviews.

Getting Started
Clone this repository.

Build the project using Maven:

go
Copy code
mvn clean package
Deploy the generated WAR file to a servlet container like Apache Tomcat.

Usage
Deploy the application to a servlet container.

Access the endpoints using tools like CURL or Postman to interact with the web service.

Endpoints
POST /addProduct - Add a new product. Requires a product name in the request body.

GET /getProduct/{productId} - Retrieve product details by productId.

DELETE /removeProduct/{productId} - Remove a product by productId.
