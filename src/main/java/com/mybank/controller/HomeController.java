package com.mybank.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/api/hello")
    public String dadJokes() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }
}
