package com.djorquera.games.questionary.QuestionaryGame.services;

import java.io.Serializable;

import com.djorquera.games.questionary.QuestionaryGame.dto.QuestionaryDTO;

public interface QuestionaryService extends Serializable{
	void createQuestionary(QuestionaryDTO questionary);
	QuestionaryDTO getActiveQuestion();
}
