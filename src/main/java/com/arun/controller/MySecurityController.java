package com.arun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/get")
public class MySecurityController {

	
	@GetMapping("/data")
	@ResponseBody
	public String getData() {
		return "Spring Security Rocks";
	}
}
