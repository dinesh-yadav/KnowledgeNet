package com.question.QuestionService.controller;

import java.util.List;
import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question add(@RequestBody Question question) {
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> get() {
        return questionService.get();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable Long id) {
        return questionService.get(id);
    }
}
