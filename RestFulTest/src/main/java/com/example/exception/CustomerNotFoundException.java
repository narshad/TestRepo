package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by narshad on 02/03/16.
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason="Customer not Found")
public class CustomerNotFoundException extends RuntimeException {

}
