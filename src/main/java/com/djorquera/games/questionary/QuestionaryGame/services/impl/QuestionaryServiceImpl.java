package com.djorquera.games.questionary.QuestionaryGame.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djorquera.games.questionary.QuestionaryGame.dto.QuestionaryDTO;
import com.djorquera.games.questionary.QuestionaryGame.model.Answer;
import com.djorquera.games.questionary.QuestionaryGame.model.Question;
import com.djorquera.games.questionary.QuestionaryGame.repository.AnswerRepository;
import com.djorquera.games.questionary.QuestionaryGame.repository.QuestionRepository;
import com.djorquera.games.questionary.QuestionaryGame.services.QuestionaryService;

@Service("questionaryService")
public class QuestionaryServiceImpl implements QuestionaryService {
	private static final long serialVersionUID = -1785644321028864591L;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	@Override
	public void createQuestionary(QuestionaryDTO questionary) {
		Question question = Question.builder().question(questionary.getQuestion()).build();
		questionRepository.save(question);
		List<Answer> answers = questionary.getAnswers().stream()
			.map(answer -> Answer.builder().correct(answer.isCorrect()).answer(answer.getAnswer()).question(question).build())
			.collect(Collectors.toList());
		answers.stream().map(answerRepository::save);
	}

}
