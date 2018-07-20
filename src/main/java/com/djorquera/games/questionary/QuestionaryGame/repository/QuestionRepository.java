package com.djorquera.games.questionary.QuestionaryGame.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.djorquera.games.questionary.QuestionaryGame.model.Question;

public interface QuestionRepository extends PagingAndSortingRepository<Question, Long>{

}
