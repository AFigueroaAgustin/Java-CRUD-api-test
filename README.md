# 🚀 API REST CRUD con Spring Boot, Hibernate y PostgreSQL

Este proyecto es una API REST básica desarrollada en **Java** usando **Spring Boot**, **Hibernate** para el manejo ORM, y **PostgreSQL** como base de datos.  

Incluye un CRUD completo para la entidad `Producto`.

---

## ✨ Características principales

- 🔄 Operaciones CRUD: Crear, Leer, Actualizar y Eliminar productos.  
- 🛠️ Controlador REST (`ProductoController`) con endpoints para manejar productos.  
- 🐘 Persistencia con **Hibernate** y repositorio JPA (`ProductoRepository`).  
- 🐘 Base de datos PostgreSQL para almacenamiento.  
- 💻 Estructura modular con entidades, repositorios y controladores bien separados.

---

## 🛠️ Requisitos

- ☕ JDK 17 o superior  
- 🐘 PostgreSQL corriendo  
- 📦 Maven o Gradle  
- IDE compatible con Java (NetBeans, IntelliJ, Eclipse)

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/tu-usuario/nombre-del-proyecto.git
2. Abrir el proyecto en tu IDE favorito.
3. Configurar conexión a la base de datos en src/main/resources/application.properties:
    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update

¡Claro! Acá tenés el bloque listo para copiar y pegar en tu README.md:

---

### 🔧 Cómo ejecutar

1. Cloná el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/nombre-del-proyecto.git
   ```

2. Abrí el proyecto en tu IDE favorito (NetBeans, IntelliJ, etc.).

3. Configurá la conexión a tu base de datos PostgreSQL en el archivo `src/main/resources/application.properties`:
   ### 🛠 Archivo de configuración

   Este proyecto incluye un archivo de plantilla para las variables de entorno necesarias.

   📄 **.env.template**

   Dentro de este archivo se encuentran las variables que deben completarse para que la aplicación funcione correctamente.  
   Cada usuario debe crear su propio archivo `.env` a partir de esta plantilla.

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Ejecutá la aplicación (dependiendo del sistema de construcción que uses):

   #### 🧱 Si usás Maven:

   ```bash
   mvn spring-boot:run
   ```

   #### 📦 Si usás Gradle:

   En Linux/macOS:

   ```bash
   ./gradlew bootRun
   ```

   En Windows:

   ```cmd
   gradlew.bat bootRun
   ```

---   
## 📚 Endpoints disponibles
Método	Ruta	Descripción
GET	/productos	Obtener lista de todos productos
POST	/productos	Crear un nuevo producto
PUT	/productos/{id}	Actualizar producto por ID
DELETE	/productos/{id}	Eliminar producto por ID

⚙️ Uso
Probar los endpoints con herramientas como Postman o curl para realizar operaciones CRUD sobre productos.

