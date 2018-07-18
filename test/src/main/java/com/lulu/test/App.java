package com.lulu.test;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
/**
 * Created by Vincent on 2017/3/13.
 * Version 1.0.0
 * Description a simple controller demo using spring boot annotations.
 */
@SpringBootApplication
public class App {
    
    public static void main(String[] args) {
    	System.err.println(111);
		SpringApplication.run(App.class, args);   
	}
}
