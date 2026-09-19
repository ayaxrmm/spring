package spring.aya.practice2.controller;

import spring.aya.practice2.config.GreetingProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    private final GreetingProperties properties;

    public GreetingController(GreetingProperties properties){
        this.properties = properties;
    }

    @GetMapping("/greeting")
    public GreetingProperties greeting(){
        return properties;
    }
}
