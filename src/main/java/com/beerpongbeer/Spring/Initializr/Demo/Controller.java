package com.beerpongbeer.Spring.Initializr.Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/beer")
    public String text (){
        return "pong";
    }

}
