package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

	@GetMapping("/WebSocket")
	public String webSocket() {
		return "index";
	}
	@GetMapping("/")
	public String index() {
		return "sample";
	}
}
