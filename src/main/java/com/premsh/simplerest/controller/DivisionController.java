package com.premsh.simplerest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.premsh.simplerest.dto.ResponseDto;
import com.premsh.simplerest.service.DivideService;


@RestController
@RequestMapping("/divide")
public class DivisionController {
	
	@Autowired
	public DivideService service;
	
	@GetMapping("/")
	public String ping () {
		return "Division API";
	}
	@GetMapping(path = "/{arg1}/{arg2}", produces = "application/json")
	public ResponseEntity<String> add(@PathVariable Integer arg1, @PathVariable Integer arg2){
		ResponseDto resultSet = new ResponseDto(Arrays.asList(arg1, arg2),"Division", service.divIntegers(arg1, arg2));		
		return new ResponseEntity<String>(new Gson().toJson(resultSet), HttpStatus.OK);
	}
	
}
