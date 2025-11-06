package com.axsosaccademy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class welcome {
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}
	@RequestMapping("/today")
	public String luck() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/Tomorrow")
	public String Tomorrow() {
		return  "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	
	
}
