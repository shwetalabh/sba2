package com.wellsfargo.batch7.sbwibs.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.sbwibs.exception.IBSException;


@ControllerAdvice
public class ExceptionsController {

	@ExceptionHandler(IBSException.class)
	public ModelAndView handleException(IBSException exp) {
		return new ModelAndView("error-page", "errMsg",exp.getMessage());
	}
}