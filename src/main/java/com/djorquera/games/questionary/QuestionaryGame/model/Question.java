package com.djorquera.games.questionary.QuestionaryGame.model;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "questions")
@Builder
public class Question {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "sended")
	@Builder.Default
	private boolean sended = false;
	
	@Column(name = "active")
	@Builder.Default
	private boolean active = false;
	
	@Column(name = "lastModified")
	@Builder.Default
	private Date lastModified = Calendar.getInstance().getTime();
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Answer> answers;
}
