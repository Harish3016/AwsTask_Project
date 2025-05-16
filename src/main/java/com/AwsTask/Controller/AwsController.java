package com.AwsTask.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	
	@GetMapping(value="/getName/{name}")
	public String getName(@PathVariable String name) {
		return name;
	}

}
