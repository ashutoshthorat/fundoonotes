package com.bridgelabz.fundoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.service.IService;

@RequestMapping("/notes")
@RestController
public class fundooController {
	@Autowired
	IService service;

	@GetMapping("/getdata")
	ResponseEntity<Boolean> checkuser()
	{
		boolean user =service.checkuser();
		return new ResponseEntity<Boolean>(user,HttpStatus.OK);
	}
}
