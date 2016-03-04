package org.example.ws.web.api;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by narshad on 04/03/16.
 */
public interface ExceptionAttributes {
    Map<String, Object> getExceptionAttributes(Exception exception,
                                               HttpServletRequest httpServletRequest, HttpStatus httpStatus);
}
