package com.djorquera.games.questionary.QuestionaryGame.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloWorldController {
	@GetMapping("/")
	public ResponseEntity<String> greetings(@RequestParam(name = "name", defaultValue="world") String name) {
		return ResponseEntity.ok("Hello "+name+"!");
	}
}
