package belajar.client1.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client2") // Pastikan nama ini sesuai dengan yang terdaftar di Eureka
public interface Client2 {

    @GetMapping("/hello2")
    String callC2FromC1();

    @GetMapping("/products")
    ResponseEntity<Object> getUserproduct();
}
