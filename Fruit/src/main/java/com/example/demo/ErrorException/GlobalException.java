package com.example.demo.ErrorException;

import org.apache.catalina.connector.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException  {

	

	
	@ExceptionHandler(value = Exception.class)
	
	public ModelAndView errorhandler() {
		ExceptionJSONInfo er=new ExceptionJSONInfo();
		er.setMessages("error");
		return new ModelAndView("Errormsg.jsp","message",er.getMessages());
		
	}
	
}
