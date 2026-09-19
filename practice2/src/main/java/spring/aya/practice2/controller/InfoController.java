package spring.aya.practice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.aya.practice2.service.InfoService;

@RestController

public class InfoController {
    private final InfoService service;

    public InfoController(InfoService service){
        this.service = service;
    }

    @GetMapping("/get/{major}")
    public String getInfo(@PathVariable String major){
        return service.giveMyMajor(major);
    }
}
