package main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

@ComponentScan(basePackages = "service.rest")
@ComponentScan(basePackages = "config")
@SpringBootApplication
public class MainClass {
    public static void main(String args[]){


        SpringApplication.run(MainClass.class,args);
        //TestR r1 = new TestR();
        //TestR r2 = new TestR();
        //System.out.println(r1.hashCode());
        //ßSystem.out.println(r2.hashCode());

    }


}
