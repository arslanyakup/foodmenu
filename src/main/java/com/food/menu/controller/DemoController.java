package com.food.menu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = "/demo", method = { RequestMethod.GET })
	public String sayHello() {
		return "naber gencler";

	}

	@RequestMapping(value = "/hi", method = { RequestMethod.GET })
	public String sayHi() {
		return "Hello World!";

	}

}
