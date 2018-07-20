package com.djorquera.games.questionary.QuestionaryGame.components;

import java.util.Calendar;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.djorquera.games.questionary.QuestionaryGame.services.QuestionaryService;

@Component
@Slf4j
public class ScheduledTasks {
	private static final int SECOND = 1000;
	private static final int MINUTE = 60*SECOND;
	private static final int HOUR = 60*MINUTE;
	private static final int DAY = 24*HOUR;
	
	@Autowired
	private QuestionaryService questionaryService;
	
 	@Scheduled(cron = "0 0 0 * * *")
	public void sendQuestionary() {
		log.info("SEND QUESTIONARIES AT {}", Calendar.getInstance().getTime());
	}
}
