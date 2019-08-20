package com.nsmeng3.faq.controller;

import com.nsmeng3.faq.dto.QuestionDTO;
import com.nsmeng3.faq.model.Question;
import com.nsmeng3.faq.model.User;
import com.nsmeng3.faq.service.QuestionService;
import com.nsmeng3.faq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(HttpServletRequest request, Model model){
        // 数据列表
        List<QuestionDTO> questionList = questionService.list();
        for (QuestionDTO questionDTO : questionList) {
            questionDTO.setDescription("4445333333");
        }
        model.addAttribute("questionList", questionList);
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "index";
        }
        for (Cookie cookie : cookies) {
            if ("token".equals(cookie.getName())) {
                String token = cookie.getValue();
                User user = userService.login(token);
                if (user != null && user.getId() != null) {
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }


        return "index";
    }

}
