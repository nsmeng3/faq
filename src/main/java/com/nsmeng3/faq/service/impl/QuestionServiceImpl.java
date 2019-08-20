package com.nsmeng3.faq.service.impl;

import com.nsmeng3.faq.mapper.QuestionMapper;
import com.nsmeng3.faq.model.Question;
import com.nsmeng3.faq.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    public void create(Question question) {
        questionMapper.create(question);
    }
}
