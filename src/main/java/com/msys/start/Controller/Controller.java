package com.msys.start.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String test(){
        return "Hi java";
    }
    @GetMapping("/hi")
    public String check(){
        return "Hi Spring boot 2.0.0";
    }
    
}
