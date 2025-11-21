# CRUD de Vehículos - Spring Boot + MongoDB

API REST para gestionar un CRUD de vehículos utilizando Spring Boot y MongoDB.

## Requisitos

- Java 17 o superior
- Maven 3.6+
- MongoDB 4.4+

## Instalación y Ejecución

1. Asegúrate de tener MongoDB corriendo en `localhost:27017`

2. Compila el proyecto:
```bash
mvn clean install
```

3. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

La API estará disponible en: `http://localhost:8080`

## Endpoints

### Obtener todos los vehículos
```
GET /api/vehiculos
```

### Obtener vehículo por ID
```
GET /api/vehiculos/{id}
```

### Obtener vehículo por placa
```
GET /api/vehiculos/placa/{placa}
```

### Obtener vehículos por marca
```
GET /api/vehiculos/marca/{marca}
```

### Crear vehículo
```
POST /api/vehiculos
Content-Type: application/json

{
  "marca": "Toyota",
  "modelo": "Corolla",
  "anio": 2023,
  "color": "Blanco",
  "placa": "ABC-123"
}
```

### Actualizar vehículo
```
PUT /api/vehiculos/{id}
Content-Type: application/json

{
  "marca": "Toyota",
  "modelo": "Corolla",
  "anio": 2023,
  "color": "Negro",
  "placa": "ABC-123"
}
```

### Eliminar vehículo
```
DELETE /api/vehiculos/{id}
```

## Tecnologías

- Spring Boot 3.2.0
- Spring Data MongoDB
- MongoDB
- Lombok
- Maven
