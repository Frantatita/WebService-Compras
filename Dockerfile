# Establecer la imagen base de Java para ejecutar la aplicación
FROM adoptopenjdk:17-jre-hotspot

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR empaquetado desde tu máquina local al contenedor
COPY target/compras-0.0.1-SNAPSHOT.jar /app/app.jar

# Exponer el puerto en el que tu aplicación Spring Boot se ejecutará dentro del contenedor
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot cuando el contenedor se inicie
CMD ["java", "-jar", "app.jar"]
