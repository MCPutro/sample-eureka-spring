package belajar.client2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientC2Controller {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/hello2")
    public String hello() {
        return "Hello from MyService 2 !";
    }


    @GetMapping("/c2")
    public String c2() {
        return restTemplate.getForObject("http://client1/hello1", String.class);
    }
}
