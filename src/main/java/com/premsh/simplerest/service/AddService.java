package com.premsh.simplerest.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class AddService {
	public Integer addIntegers(Integer ...args) {
		return Arrays.stream(args).reduce(0, (a,b)->a+b);
	}
}
