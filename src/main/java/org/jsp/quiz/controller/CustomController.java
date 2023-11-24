package org.jsp.quiz.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomController  implements ErrorController{

	@RequestMapping("/error")
	public String handleError(HttpServletRequest request)
	{
	Object status= request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	
	
	  if(status != null && Integer.valueOf( status.toString())==HttpStatus.NOT_FOUND.value())
		  
		  return "404";
	{
		return "error";
	}
	}
}
