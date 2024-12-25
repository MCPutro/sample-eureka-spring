package belajar.client1.controller;

import belajar.client1.external.Client2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private Client2 client2;

    @GetMapping("/hello1")
    public String hello() {
        return "Hello from MyService 1 !";
    }

    @GetMapping("/c1")
    public String callFuncClient2(){
        return "ini dari client 1 tapi "+this.client2.callC2FromC1();
    }
}
