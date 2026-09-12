package kz.aya.practice1.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class InfoService {
    public Integer age = 20;
    public String name = "Aya";
    public Integer yearOfStudy = 4;

    public String giveMyMajor(String major){
        if(Objects.equals(major, "IS")){
            return "Age is: " + age + " name: " + name + " year of study: " + yearOfStudy;
        }
        return "your major is - " + major;
    }

    public String deleteMyMajor(String major, Integer age, Integer yearOfStudy) {
        return "Deleted my major: " + major + ", age: " + age + ", year of study: " + yearOfStudy;
    }
}
