package com.djorquera.games.questionary.QuestionaryGame.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djorquera.games.questionary.QuestionaryGame.dto.QuestionaryDTO;

@RestController
@RequestMapping("/api/questionary/register")
public class RegisterQuestionaryController {
	@Autowired
	private JmsTemplate jms;
	
	@PostMapping("/")
	public ResponseEntity<String> register(@RequestBody QuestionaryDTO questionary) {
		jms.convertAndSend("registerQuestionary", questionary);
		return ResponseEntity.ok("Questionary sended for validation.");
	}
}
