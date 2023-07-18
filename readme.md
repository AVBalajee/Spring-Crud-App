# CRUD Application
CRUD refers to the basic operations of Create, Read, Update, and Delete that are commonly performed on data in a database or through a web service. Spring Boot provides several features and components that simplify the implementation of CRUD operations.
#### CREATE:
- Define a model or entity class representing the data you want to create.
- Use Spring Data JPA annotations (e.g., @Entity, @Table, @Column) to map the entity to the corresponding database table.
- Create a repository interface that extends the JpaRepository interface from Spring Data JPA. This interface provides methods for CRUD operations out of the box.
- Implement a controller class to handle incoming requests for creating new data. Use the @PostMapping annotation to map the request to a specific endpoint.
- In the controller method, use the repository to save the data to the database using the save() method.

#### READ:
- Define a repository interface that extends JpaRepository or another Spring Data repository interface.
- Use the repository methods like findAll(), findById(), or custom query methods to retrieve data from the database.
- Implement a controller method annotated with @GetMapping to handle requests for retrieving data. Use the repository methods to fetch the data from the database and return it as a response.

#### UPDATE:
- Define a controller method annotated with @PutMapping or @PatchMapping to handle update requests.
- Use the repository to retrieve the existing data based on its ID using the findById() method.
- Update the relevant fields of the retrieved object with the new values provided in the request.
- Use the save() method of the repository to persist the updated object back to the database.

#### DELETE:
- Define a controller method annotated with @DeleteMapping to handle delete requests.
- Use the repository's deleteById() method to remove the data from the database based on its ID.

## Requirements 

- Java 8 or higher
- Maven

## Dependencies

- Spring Boot Web: To create a RESTful API for the CRUD operations.
- Spring Boot Data JPA: To handle database operations and ORM.
- H2 Database: An in-memory database for demonstration purposes.
- Spring Boot DevTools: Provides development-time tools like automatic restart, etc.

## Getting Started

1. Clone the repository:

   ```shell
   https://github.com/AVBalajee/Spring-Boot-Projects.git
2. Build the project using Maven:
   ```shell
   cd crud-application
   mvn clean install
3. Run the Application:
   ```shell
   mvn spring-boot:run //The application will start running at http://localhost:8080

## API ENDPOINTS

### 1. Create a Id/Task
    POST /tasks

    Request Body:
        
        {
            "title": "Task 1",
            "description": "Description of Task 1",
            "completed": false
        }
  

### 2. Read a Id/Task
    GET /tasks     // Get All Id

    GET /tasks/{id}      // Get or Read the Details specific to the ID


### 3. Update a Id/Task
    PUT /tasks/{id}
      
    Request Body:
      
      
    {
          "title": "Updated Task 1",
          "description": "Updated description",
          "completed": true
    }

### 4. Delete a Id/Task
    DELETE /tasks/{id}
    
    //Replace {id} with the ID of the task you want to delete.


