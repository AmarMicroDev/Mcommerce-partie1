package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class ProduitGratuitException extends RuntimeException {
	
	public ProduitGratuitException(String s) {
		super(s);
	}

}
