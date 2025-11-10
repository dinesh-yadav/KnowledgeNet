package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {
    List<Question> get();

    Question create(Question question);

    Question get(Long questionId);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
