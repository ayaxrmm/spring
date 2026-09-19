package spring.aya.practice2.service;

import org.springframework.stereotype.Service;
import spring.aya.practice2.config.InfoProperties;

import java.util.Objects;

@Service

public class InfoService {
    private final InfoProperties properties;

    public InfoService(InfoProperties properties){
        this.properties = properties;
    }

    public String giveMyMajor(String major){
        if(Objects.equals(major, "IS")){
            return "Age is: " + properties.age() + " name: " + properties.name() + " year of study: " + properties.yearOfStudy();
        }
        return "your major is - " + major;
    }
}
