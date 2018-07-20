package com.djorquera.games.questionary.QuestionaryGame.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djorquera.games.questionary.QuestionaryGame.components.ScheduledTasks;
import com.djorquera.games.questionary.QuestionaryGame.dto.QuestionaryDTO;
import com.djorquera.games.questionary.QuestionaryGame.services.QuestionaryService;

@RestController
@RequestMapping("/api/questionary")
public class QuestionaryController {
	@Autowired
	private ScheduledTasks tasks;
	
	@Autowired
	private QuestionaryService service;
	
	@PostMapping("/scheduled/send")
	public ResponseEntity<String> sendQuestinaries() {
		tasks.sendQuestionary();
		return ResponseEntity.ok("OK");
	}
	
	@GetMapping("/questionary/active")
	public ResponseEntity<QuestionaryDTO> activeQuestionary() {
		return ResponseEntity.ok(service.getActiveQuestion());
	}
}
