package com.example.demo;

import java.util.Date;

// import org.springframework.stereotype.Controller; // Qual a diferença?

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return new Greeting(name, getGreeting());
    }

	@SuppressWarnings("deprecation")
	private String getGreeting() {
		Date date = new Date();
		String mensage = "";
		int hora = date.getHours();
		if (hora >= 0 && hora < 12) mensage += "Bom dia.";
		else if (hora >= 12 && hora < 18) mensage += "Boa tarde.";
		else if (hora >= 18 && hora < 24) mensage += "Boa noite.";
		return mensage;
	}

}
