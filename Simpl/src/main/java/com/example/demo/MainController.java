package com.example.demo;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class MainController {
 
	@GetMapping("/")
    public String index(Model model) {
    	String name = "grace Hopper";
    	String itemName = "Copper Wire";
    	double price = 5.25;
    	String description = "Metal stripts, also an illustration";
    	String vendor = "Little things Corner Store";
    	
    	
    	model.addAttribute("first", name);
    	model.addAttribute("item", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("desc", description);
    	model.addAttribute("vendor", vendor);
    	
    	return "index";
    }
}