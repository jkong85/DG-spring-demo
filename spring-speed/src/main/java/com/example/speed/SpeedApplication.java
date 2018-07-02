package com.example.speed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class SpeedApplication {
    @RequestMapping("/engining")
    String home() {
        return "/engining";
    }
    @RequestMapping(value="/engining/cur",method= RequestMethod.GET)
    public String sayHello(){
        return "/engining/cur";
    }

    @RequestMapping(value = "/engining/speed", method = RequestMethod.POST)
    @ResponseBody
    public String postFoos() {
        return "/engining/speed is updated successfully\n";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpeedApplication.class, args);
    }
}
