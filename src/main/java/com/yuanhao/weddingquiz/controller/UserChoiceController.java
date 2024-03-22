package com.yuanhao.weddingquiz.controller;

import com.yuanhao.weddingquiz.service.UserChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserChoiceController {

    private final UserChoiceService userChoiceService;

    @Autowired
    public UserChoiceController(UserChoiceService userChoiceService) {
        this.userChoiceService = userChoiceService;
    }

    @PostMapping("/user-choices")
    public ResponseEntity<Void> createUserChoice(@RequestBody UserChoiceRequestDto userChoiceDTO) {
        userChoiceService.insertUserChoice(userChoiceDTO.getUserName(), userChoiceDTO.getChoices());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/display")
    public String getUserChoicesByDate(Model model) {
        final var groupedByDate = userChoiceService.groupByDate();
        model.addAttribute("groupedByDate", groupedByDate);
        model.addAttribute("maxChoices", 24);
        return "userChoices";
    }
}