package com.lulu.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("webTest/")
public class WebTest {
	
	@RequestMapping("hello")
	public void hello() {
		System.err.println("hello world spring boot");
	}
}
