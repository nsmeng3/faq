package com.nsmeng3.faq.service.impl;

import com.nsmeng3.faq.dto.QuestionDTO;
import com.nsmeng3.faq.mapper.QuestionMapper;
import com.nsmeng3.faq.mapper.UserMapper;
import com.nsmeng3.faq.model.Question;
import com.nsmeng3.faq.model.User;
import com.nsmeng3.faq.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public void create(Question question) {
        questionMapper.create(question);
    }

    @Override
    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
