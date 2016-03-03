package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by narshad on 02/03/16.
 */
@RestController
public class HomeController{
    @Value("${app.name}")
    private String appName;
    @RequestMapping("/")
    public String home() {
        return "Hello " + appName;
    }
}
