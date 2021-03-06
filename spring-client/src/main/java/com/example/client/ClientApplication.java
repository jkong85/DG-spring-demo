package com.example.client;

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
public class ClientApplication {
    @RequestMapping("/")
    String home() {
        return "Hello World";
    }
    @RequestMapping(value="/second",method= RequestMethod.GET)
    public String sayHello(){
        return "second ";
    }

    @RequestMapping(value = "/speed", method = RequestMethod.POST)
    @ResponseBody
    public String postFoos() {
        return "Speed is updated successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
