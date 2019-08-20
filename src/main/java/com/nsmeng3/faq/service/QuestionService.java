package com.nsmeng3.faq.service;

import com.nsmeng3.faq.dto.QuestionDTO;
import com.nsmeng3.faq.model.Question;

import java.util.List;

public interface QuestionService {

    void create(Question question);

    List<QuestionDTO> list();
}
