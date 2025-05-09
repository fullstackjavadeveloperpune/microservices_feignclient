# microservices_feignclient
Spring Boot with Microservices using Feign Client

Microservices- 2 or more Spring Boot module they will communicate with each other

Services-
DepartmentService- 9191
EmployeeService- 9192
ServiceRegistry- 8761
APIGateway- 2025

Service Communication- Feign Client

Design Pattern-
1. SAGA- service per DB
2. Circuit Breaker- Fault Tolerance
   3 states- 1. Close 2. Half-Open 3. Open
