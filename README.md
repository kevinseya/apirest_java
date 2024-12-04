# API REST en Java con Spring Boot

Este proyecto es una API REST sencilla creada con Spring Boot que permite gestionar una lista de nombres. La API ofrece operaciones básicas como obtener una lista de nombres, actualizar un nombre en un índice específico y un saludo en la ruta raíz.

## Estructura del Proyecto

- **`ApirestJavaApplication.java`**: La clase principal que ejecuta la aplicación Spring Boot y define los controladores de la API.
- **Endpoints**:
  - `GET /`: Devuelve un saludo simple: "¡Hello world!".
  - `GET /nombres`: Devuelve la lista de nombres.
  - `PUT /nombres/{index}`: Permite actualizar el nombre en el índice especificado.

## Requisitos

- **JDK 11** o superior.
- **Maven** (para la gestión de dependencias y construcción del proyecto).

## Instalación

1. **Clona el repositorio** y navega al directorio del proyecto:

    ```bash
    git clone <https://github.com/kevinseya/apirest_java.git>
    ```

2. **Compila y ejecuta la aplicación** con Maven:

    ```bash
    mvn spring-boot:run
    ```

3. La aplicación se ejecutará en `http://localhost:8080`.

## Uso de los Endpoints

### 1. `GET /`

Devuelve un saludo simple:

**Respuesta:**

```plaintext
¡Hello world!
```
## 2. GET /nombres

Devuelve la lista de nombres actuales:

**Respuesta:**
```plaintext
["Juan", "Pedro", "María", "Ana", "Luis"]
```
## 3. PUT /nombres/{index}

Permite actualizar un nombre en el índice especificado. El cuerpo de la solicitud debe contener el nuevo nombre.

Ejemplo de solicitud PUT:
```
PUT /nombres/2
Content-Type: application/json

"NuevoNombre"
```
