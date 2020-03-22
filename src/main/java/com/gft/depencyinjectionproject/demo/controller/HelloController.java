package com.gft.depencyinjectionproject.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Value("${app.name}")
//    private String appName;
//

    @RequestMapping("/hello")
    public String Hello(){


//        return "Hello World." + appName + ".";
        return "Hello World.";
    }

}
