package com.djorquera.games.questionary.QuestionaryGame.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnswerDTO implements Serializable{
	private static final long serialVersionUID = 8953581255355995227L;

	private String answer;
	private boolean correct;
	
}
