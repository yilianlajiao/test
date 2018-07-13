package com.lulu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Test {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String home(String param) {
		System.err.println("param  = " + param);
		return "你好，Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);

	}

}
