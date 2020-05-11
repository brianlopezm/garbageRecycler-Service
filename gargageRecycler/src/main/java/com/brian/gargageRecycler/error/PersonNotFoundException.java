package com.brian.gargageRecycler.error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends RuntimeException {

	  public PersonNotFoundException(String exception) {
	    super(exception);
	  }

}