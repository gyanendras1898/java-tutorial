package com.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Inventory Not Found")
public class InventoryNotFoundException extends RuntimeException{

	public InventoryNotFoundException(String msg) {
		super(msg);
	}
}
