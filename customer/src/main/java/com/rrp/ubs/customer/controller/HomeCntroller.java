package com.rrp.ubs.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@CrossOrigin
@Controller
@ApiIgnore
public class HomeCntroller {
	
	// request mapping is used for routing the request from client/browser.
	@RequestMapping("/")
	public String home() {
		return "redirect:swagger-ui.html";
	}

}
