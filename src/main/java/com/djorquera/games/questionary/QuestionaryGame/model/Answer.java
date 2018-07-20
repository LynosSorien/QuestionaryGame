package com.djorquera.games.questionary.QuestionaryGame.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "answers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Answer implements Serializable {
	private static final long serialVersionUID = 2062768641912776346L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "answer")
	private String answer;

	@Column(name = "correct")
	@Builder.Default
	private boolean correct = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "id", name = "question_id")
	private Question question;
	
	public static class AnswerBuilder {
		public AnswerBuilder correctAnswer(String answer) {
			return this.correct(true).answer(answer);
		}
	}

}
