package com.digitalinnovation.one.bootcamp.exceptions;

import java.io.Serializable;

public class BusinessException extends RuntimeException implements Serializable{
	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {
		super(message);
	}

}
