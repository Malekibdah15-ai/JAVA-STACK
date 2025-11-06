package com.axsosaccademy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RequestMapping("/daicichi")
public class PathvaribalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathvaribalsApplication.class, args);
	}
	@RequestMapping("/travel/{Hononulu}")
    public String city(@PathVariable("Hononulu") String Hononulu){
        return "congratulation you will soon travel to " + Hononulu;
    }
	@RequestMapping("/latto/{number}")
	public String index(@PathVariable("number") int number) {
		if(number % 2 == 0) {
			return  "you will have trip in the near futere";
		}else {
			return " you have enjoud the fruets in your labor";
		}
	}
 }

    