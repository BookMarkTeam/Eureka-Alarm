package com.example.eurekaalarm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alarms/")
@Slf4j
public class EurekaAlarmController {
    @GetMapping("/test")
    public String test() {
        return "Alarm test";
    }
}
