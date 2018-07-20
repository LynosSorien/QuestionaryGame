package com.djorquera.games.questionary.QuestionaryGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.djorquera.games.questionary.QuestionaryGame.model.Question;

public interface QuestionRepository extends PagingAndSortingRepository<Question, Long>{
	@Query("select q from Question q where active = 1 order by insertedTime asc")
	List<Question> listOfActiveQuestions();
}
