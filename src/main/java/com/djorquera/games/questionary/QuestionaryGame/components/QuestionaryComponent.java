package com.djorquera.games.questionary.QuestionaryGame.components;

import lombok.extern.slf4j.Slf4j;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.djorquera.games.questionary.QuestionaryGame.dto.QuestionaryDTO;
import com.djorquera.games.questionary.QuestionaryGame.services.QuestionaryService;

@Component
@Slf4j
public class QuestionaryComponent {
	private QuestionaryService service;
	
	public QuestionaryComponent(QuestionaryService service) {
		this.service = service;
		log.info("Service {}", service);
	}
	
	@JmsListener(destination = "registerQuestionary", containerFactory = "questionaryRegistrationFactory")
	public void receivedNewQuestionary(QuestionaryDTO dto) {
		log.info("Register new questionary {}", dto);
		service.createQuestionary(dto);
	}
}
