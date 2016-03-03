package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by narshad on 02/03/16.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        return "Hello DevTools!";
    }
}
