package com.dbzq.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResovler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		String message=null;
		ex.printStackTrace();
		CustomException customException=null;
		if(ex instanceof CustomException) {
			customException=(CustomException) ex;
		}else {
			customException=new CustomException("unknown");
		}
		message=customException.getMessage();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message",message);
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
