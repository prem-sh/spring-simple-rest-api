package com.premsh.simplerest.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class SubService {
	public Integer subIntegers(Integer ...args) {
		Integer startInteger = args[0];
		args[0] = 0;
		return Arrays.stream(args).reduce(startInteger, (a,b)->a-b);
	}
}
