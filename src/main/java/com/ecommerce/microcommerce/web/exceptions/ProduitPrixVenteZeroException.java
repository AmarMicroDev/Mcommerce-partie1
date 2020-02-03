package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitPrixVenteZeroException extends RuntimeException {

    public ProduitPrixVenteZeroException(String s) {
        super(s);
    }
}
