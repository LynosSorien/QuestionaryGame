package com.djorquera.games.questionary.QuestionaryGame.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djorquera.games.questionary.QuestionaryGame.components.ScheduledTasks;

@RestController
@RequestMapping("/api/questionary")
public class QuestionaryController {
	@Autowired
	private ScheduledTasks tasks;
	
	@PostMapping("/scheduled/send")
	public ResponseEntity<String> sendQuestinaries() {
		tasks.sendQuestionary();
		return ResponseEntity.ok("OK");
	}
}
