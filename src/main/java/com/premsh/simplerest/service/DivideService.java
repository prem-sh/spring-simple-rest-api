package com.premsh.simplerest.service;

import org.springframework.stereotype.Service;

@Service
public class DivideService {
	public Integer divIntegers(Integer arg1, Integer arg2) {
		return arg1/arg2;
	}
}
