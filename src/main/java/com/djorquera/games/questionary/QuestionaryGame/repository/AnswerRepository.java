package com.djorquera.games.questionary.QuestionaryGame.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.djorquera.games.questionary.QuestionaryGame.model.Answer;

public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long>{

}
