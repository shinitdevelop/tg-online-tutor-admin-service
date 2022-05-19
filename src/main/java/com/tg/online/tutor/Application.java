package com.tg.online.tutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.tg.common.service","com.tg.online.tutor"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
