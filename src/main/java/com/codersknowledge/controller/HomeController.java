package com.codersknowledge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zubayer
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String loadHomePage() {
		return "home";
	}
}
