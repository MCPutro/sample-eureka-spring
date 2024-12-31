package belajar.apigateway.config;

/*
IntelliJ IDEA 2024.2.4 (Community Edition)
Build #IC-242.23726.103, built on October 23, 2024
@Author mcputro a.k.a. Mu'ti Cahyono Putro
Created on 31 Dec 2024 13:24
@Last Modified 31 Dec 2024 13:24
Version 1.0
*/

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // Rute untuk service-a
//                .route("CLIENT1", r -> r.path("/service-a/**")
//                        .uri("lb://service-a")) // Menggunakan load balancer untuk service-a
//                // Rute untuk service-b
//                .route("CLIENT2", r -> r.path("/service-b/**")
//                        .uri("lb://service-b")) // Menggunakan load balancer untuk service-b
//                .build();

        return builder.routes()
                // Rute untuk client1
                .route("client1-helloXXX", r -> r.path("/hello1")
                        .uri("lb://client1")) // Menggunakan load balancer untuk client1
                .route("client1-c1", r -> r.path("/c1")
                        .uri("lb://client1")) // Menggunakan load balancer untuk client1
                .route("client1-users", r -> r.path("/users")
                        .uri("lb://client1")) // Menggunakan load balancer untuk client1
                .route("client1-users-product", r -> r.path("/users/product")
                        .uri("lb://client1")) // Menggunakan load balancer untuk client1

                // Rute untuk client2
                .route("client2-c2", r -> r.path("/c2")
                        .uri("lb://client2")) // Menggunakan load balancer untuk client2
                .route("client2-products", r -> r.path("/products")
                        .uri("lb://client2")) // Menggunakan load balancer untuk client2
                .route("client2-hello", r -> r.path("/hello2")
                        .uri("lb://client2")) // Menggunakan load balancer untuk client2
                .build();
    }
}
