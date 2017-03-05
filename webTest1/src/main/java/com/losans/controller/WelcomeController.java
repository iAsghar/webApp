package com.losans.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Value("${welcome.message}")
	private String message;
	
	@RequestMapping("/sayHello")
	public String showMessage(Map<String, Object> map){
		/*List<String> list=new ArrayList<>();
		list.add("orange");
		list.add("blue");
		map.put("list", list);
		map.put("msg", this.message);
		return "welcome";*/
		return "Hello World";
	}
}
