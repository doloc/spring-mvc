package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	}
}
