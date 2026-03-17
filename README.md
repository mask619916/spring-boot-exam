# Product Inventory Management API

A Spring Boot REST API that manages product inventory in-memory. This application provides endpoints to create, read, update, and delete products with proper HTTP status codes and error handling.

## How to Run

```bash
./mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | `/api/products` | Retrieve all products |
| GET | `/api/products/{id}` | Retrieve a product by ID |
| POST | `/api/products` | Create a new product |
| PUT | `/api/products/{id}` | Update an existing product |
| DELETE | `/api/products/{id}` | Delete a product by ID |

## curl Examples

### 1. GET All Products
```bash
curl -X GET http://localhost:8080/api/products
```

### 2. GET Product by ID
```bash
curl -X GET http://localhost:8080/api/products/1
```

### 3. POST Create New Product
```bash
curl -X POST http://localhost:8080/api/products ^
  -H "Content-Type: application/json" ^
  -d "{\"name\":\"Laptop\",\"category\":\"Electronics\",\"price\":999.99,\"quantity\":10}"
```

### 4. PUT Update Product
```bash
curl -X PUT http://localhost:8080/api/products/1 ^
  -H "Content-Type: application/json" ^
  -d "{\"name\":\"Gaming Laptop\",\"category\":\"Electronics\",\"price\":1299.99,\"quantity\":5}"
```

### 5. DELETE Product
```bash
curl -X DELETE http://localhost:8080/api/products/1
```

### 6. Search Products by Name Keyword
```bash
curl -X GET "http://localhost:8080/api/products/search?keyword=laptop"
```

### 7. Get Products by Category
```bash
curl -X GET http://localhost:8080/api/products/category/Electronics
```

## Sample Responses

### GET /api/products (200 OK)
Command used:
```bash
curl -X GET http://localhost:8080/api/products
```

```json
[{"id":1,"name":"Laptop","category":"Electronics","price":999.9,"quantity":10},{"id":2,"name":"Mouse","category":"Accessories","price":28.5,"quantity":50}]
```

### GET /api/products/1 (200 OK)
Command used:
```bash
curl -X GET http://localhost:8080/api/products/1
```

```json
{"id":1,"name":"Laptop","category":"Electronics","price":999.9,"quantity":10}
```

### POST /api/products (201 Created)
Command used:
```bash
curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d "{\"name\":\"Keyboard\",\"category\":\"Accessories\",\"price\":79.9,\"quantity\":25}"
```

```json
{"id":3,"name":"Keyboard","category":"Accessories","price":79.9,"quantity":25}
```

### PUT /api/products/1 (200 OK)
Command used:
```bash
curl -X PUT http://localhost:8080/api/products/1 -H "Content-Type: application/json" -d "{\"name\":\"Gaming Laptop\",\"category\":\"Electronics\",\"price\":380.5,\"quantity\":5}"
```

```json
{"id":1,"name":"Gaming Laptop","category":"Electronics","price":380.5,"quantity":5}
```

### DELETE /api/products/1 (204 No Content)
Command used:
```bash
curl -X DELETE http://localhost:8080/api/products/1
```

No response body. Status code indicates successful deletion.

### GET /api/products/999 (404 Not Found)
Command used:
```bash
curl -X GET http://localhost:8080/api/products/999
```

```json
null
```
