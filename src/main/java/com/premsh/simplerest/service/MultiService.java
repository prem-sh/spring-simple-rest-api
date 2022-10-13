package com.premsh.simplerest.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class MultiService {
	public Integer multiplyIntegers(Integer ...args) {
		return Arrays.stream(args).reduce(1, (a,b)->a*b);
	}
}
