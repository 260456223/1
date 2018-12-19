package com.zhiyou100.SpringBoot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler
	@ResponseBody
	public String exceptionHandler(HttpServletRequest req,Exception e){
		return "又500了";
	}
	
	
	
	
	
}
