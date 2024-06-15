# 🌐 Servicio Web con Spring Boot

Este proyecto es un servicio web desarrollado con **Spring Boot**.

## 🚀 Requisitos

### Para ejecutar localmente:
- ☕ **JDK 11** o superior
- 🛠️ **Maven 3.6.0** o superior

### Para ejecutar con Docker:
- 🐳 **Docker 19.03** o superior

## 🛠️ Instrucciones para Ejecutar Localmente

1. **Clonar el repositorio:**
    ```
    git clone https://github.com/Frantatita/WebService-Compras.git
    cd WebService-Compras
    ```

2. **Compilar el proyecto:**
    ```
    mvn compile
    mvn clean package (Generando el jar)
    ```

3. **Ejecutar el servicio:**
    ```
    mvn spring-boot:run
    java -jar compras-0.0.1-SNAPSHOT.jar.jar (Ejecutar el jar)
    ```

4. **Acceder al servicio:**
   - El servicio estará disponible en `http://localhost:8080`.

## 🐳 Instrucciones para Ejecutar con Docker

1. **Clonar el repositorio:**
    ```
    git clone https://github.com/Frantatita/WebService-Compras.git
    cd WebService-Compras
    ```

2. **Construir la imagen Docker:**
    ```
    docker build -t servicioSpringboot
    ```

3. **Ejecutar el contenedor:**
    ```
    docker run -p 8080:8080 servicioSpringboot
    ```

4. **Acceder al servicio:**
   - El servicio estará disponible en `http://localhost:8080`.
