package com.djorquera.games.questionary.QuestionaryGame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.djorquera.games.questionary.QuestionaryGame.components.QuestionaryComponent;
import com.djorquera.games.questionary.QuestionaryGame.components.ScheduledTasks;
import com.djorquera.games.questionary.QuestionaryGame.services.QuestionaryService;

@Configuration
@EnableScheduling
public class AppConfig {
	
	@Bean
	public QuestionaryComponent questionaryComponent(QuestionaryService questionaryService) {
		return new QuestionaryComponent(questionaryService);
	}
	
	@Bean
	public ScheduledTasks scheduledTasks() {
		return new ScheduledTasks();
	}
}
