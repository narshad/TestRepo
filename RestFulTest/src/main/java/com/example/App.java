package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by narshad on 02/03/16.
 */
@EnableAutoConfiguration
@ComponentScan("com.example")
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class,args);
    }
}
