package kz.aya.practice1.controlller;

import kz.aya.practice1.service.InfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController


public class InfoController {
    private final InfoService PostInfo;

    public InfoController(InfoService PostInfo){
        this.PostInfo = PostInfo;
    }

    @GetMapping("/api/getinfo/{major}")
    public String getInfo(@PathVariable String major){
        return PostInfo.giveMyMajor(major);
    }


    @PostMapping("/api/postinfo")
    public String postInfo(@RequestBody String major){
        return PostInfo.giveMyMajor(major);
    }

    @PutMapping("api/putinfo")
    public String putInfo(@RequestBody(required = false) String major) {
        return PostInfo.giveMyMajor(major);
    }

    @DeleteMapping("/api/deleteinfo/{major}")
    public String deleteInfo(@PathVariable String major,
                             @RequestBody Integer age,
                             @RequestBody Integer yearOfStudy){
        return PostInfo.deleteMyMajor(major, age, yearOfStudy);
    }
}
