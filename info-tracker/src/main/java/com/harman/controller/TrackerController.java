package com.harman.infotracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrackerController {
	
	@RequestMapping(value = "/info/", method = RequestMethod.GET)
	public Object info() {
		
		return "success";
		
		
	}

}
