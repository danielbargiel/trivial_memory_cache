package com.example.tmemcache.service;

import org.springframework.boot.*; 
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Service
public class RestService {

	@RequestMapping("/")
	String home() {
		return "This is home page";
	}
}
