package lk.ijse.dep.spring.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/hello")
public class MyController {

    @GetMapping
    public String doSomething() {
        return "Hello Spring Web MVC";
    }

    @PostMapping
    public String doPostRequest(){
        return "POST Request";
    }

    @PutMapping
    public String doPutRequest(){
        return "PUT Request";
    }

    @DeleteMapping
    public String doDeleteRequest(){
        return "Delete Request";
    }

}
