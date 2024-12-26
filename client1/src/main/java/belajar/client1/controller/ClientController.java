package belajar.client1.controller;

import belajar.client1.entity.User;
import belajar.client1.external.Client2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    private List<User> listUser = new ArrayList<>();

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

    @GetMapping("/users")
    public ResponseEntity<Object> getUser(){
        if (listUser.isEmpty()){
            listUser.add(new User(1, "name1"));
            listUser.add(new User(2, "name2"));
            listUser.add(new User(3, "name3"));
            listUser.add(new User(4, "name4"));
        }

        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }

    @GetMapping("/users/product")
    public ResponseEntity<Object> getUserProduct(){

        return this.client2.getUserproduct();


//        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }
}
