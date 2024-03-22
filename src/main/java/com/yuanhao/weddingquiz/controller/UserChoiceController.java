package com.yuanhao.weddingquiz.controller;

import com.yuanhao.weddingquiz.service.UserChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userChoices")
public class UserChoiceController {

    private final UserChoiceService userChoiceService;

    @Autowired
    public UserChoiceController(UserChoiceService userChoiceService) {
        this.userChoiceService = userChoiceService;
    }

    @PostMapping
    public ResponseEntity<Void> createUserChoice(@RequestBody UserChoiceRequestDto userChoiceDTO) {
        userChoiceService.insertUserChoice(userChoiceDTO.getUserName(), userChoiceDTO.getChoices());
        return ResponseEntity.ok().build();
    }
}