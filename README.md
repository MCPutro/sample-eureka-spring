# EUREKA

default localhost:8761

test : 
> http://localhost:8082/c2 -> call api in client 1 from client 2
> http://localhost:8081/c1 -> call api in client 2 from client 1
