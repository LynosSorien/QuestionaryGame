package com.djorquera.games.questionary.QuestionaryGame.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.djorquera.games.questionary.QuestionaryGame.model.Answer;

public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long>{
	List<Answer> findByQuestionIdEqual(Long questionId);
}
