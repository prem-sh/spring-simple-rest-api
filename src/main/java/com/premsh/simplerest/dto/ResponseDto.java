package com.premsh.simplerest.dto;

import java.util.List;


public class ResponseDto {
	private List<Integer> args;
	private String operation;
	private Integer result;
	
	public ResponseDto(List<Integer> args, String operation, Integer result) {
		this.args = args;
		this.operation = operation;
		this.result = result;
	}

	public List<Integer> getArgs() {
		return args;
	}

	public void setArgs(List<Integer> args) {
		this.args = args;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
}
