package main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "service.rest")
@ComponentScan(basePackages = "config")
@SpringBootApplication
public class MainClass {
    public static void main(String args[]){

        SpringApplication.run(MainClass.class,args);

    }

}
