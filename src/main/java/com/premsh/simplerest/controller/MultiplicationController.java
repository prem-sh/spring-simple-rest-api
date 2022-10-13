package com.premsh.simplerest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.premsh.simplerest.dto.ResponseDto;
import com.premsh.simplerest.service.MultiService;

@RestController
@RequestMapping("/multiply")
public class MultiplicationController {
	
	@Autowired
	public MultiService service;
	
	@GetMapping("/")
	public String ping () {
		return "Multiplication API";
	}
	
	@GetMapping(path = "/{arg1}/{arg2}", produces = "application/json")
	public ResponseEntity<String> add(@PathVariable Integer arg1, @PathVariable Integer arg2){
		ResponseDto resultSet = new ResponseDto(Arrays.asList(arg1, arg2),"Multiplication", service.multiplyIntegers(new Integer[]{arg1, arg2}));		
		return new ResponseEntity<String>(new Gson().toJson(resultSet), HttpStatus.OK);
	}
	
	@GetMapping(path = "/vararg", produces = "application/json")
	public ResponseEntity<String> add(@RequestParam String args){
		Integer[] convertedArgs = (Integer[]) Arrays.stream(args.split(",")).map(Integer::parseInt).toArray(Integer[]::new);
		ResponseDto resultSet = new ResponseDto(Arrays.asList(convertedArgs),"Multiplication", service.multiplyIntegers(convertedArgs));		
		return new ResponseEntity<String>(new Gson().toJson(resultSet), HttpStatus.OK);
	}
}
