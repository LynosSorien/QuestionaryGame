package com.djorquera.games.questionary.QuestionaryGame.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuestionaryDTO implements Serializable {
	private static final long serialVersionUID = -3919482953156777772L;

	private String question;
	private List<AnswerDTO> answers;
}
