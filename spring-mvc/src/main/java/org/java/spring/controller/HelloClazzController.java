package org.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloClazzController {
	
	public HelloClazzController() {
		System.out.println("khoi tao");
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView printMessage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("message", "hello java clazz");
		return mv;
	}
}