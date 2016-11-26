# microservices
Spring Cloud Netflix project base, Spring Rest Repository.

# Read me
The micro-service project is based on five main projects

# Student
The student project is mapped with a Student Entity where CRUD operations are implemented by a RepositoryRestResource annotation, being only a query service and basic operations such as saving, editing, exiting and listing
Accessing through the url http://localhost:8081/alunos/.

# Matter
The subject matter mapped with the Subject Entity where CRUD operations are implemented by a RepositoryRestResource annotation, being only a query service and basic operations such as saving, editing, exiting, and listing
Accessing through the url http://localhost:8082/materias/.

# Eureka Server
Eureka server project

# Zuul Routing
Project that filters as routes for services and internal (microservices Students and Matters) and public (Project Evaluation)

Evaluation
Project Web / Mobile consumer services Students and Materials that seek as evidence made by the student searched in the url
http://localhost:8080/tests/alunos/{idAluno}.
