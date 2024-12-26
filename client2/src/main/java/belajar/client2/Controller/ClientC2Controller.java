package belajar.client2.Controller;

import belajar.client2.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientC2Controller {

    @Autowired
    private RestTemplate restTemplate;

    private List<product> productList = new ArrayList<>();

    @GetMapping("/hello2")
    public String hello() {
        return "Hello from MyService 2 !";
    }

    @GetMapping("/c2")
    public String c2() {
        return restTemplate.getForObject("http://client1/hello1", String.class);
    }

    @GetMapping("/products")
    public ResponseEntity<Object> getProductList(){
        if (this.productList.isEmpty()){
            this.productList.add(new product(1, "baju", 1000.0));
            this.productList.add(new product(2, "celana", 5600.0));
            this.productList.add(new product(3, "ember", 600.0));
        }

        return new ResponseEntity<>(this.productList, HttpStatus.OK);
    }
}
