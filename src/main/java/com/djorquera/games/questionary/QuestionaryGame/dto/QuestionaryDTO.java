package com.djorquera.games.questionary.QuestionaryGame.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class QuestionaryDTO implements Serializable {
	private static final long serialVersionUID = -3919482953156777772L;

	private String question;
	private List<AnswerDTO> answers;
}
