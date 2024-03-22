package com.yuanhao.weddingquiz.service;

import com.yuanhao.weddingquiz.persistence.UserChoice;
import com.yuanhao.weddingquiz.persistence.UserChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserChoiceService {

    private final UserChoiceRepository userChoiceRepository;

    @Autowired
    public UserChoiceService(UserChoiceRepository userChoiceRepository) {
        this.userChoiceRepository = userChoiceRepository;
    }

    public void insertUserChoice(String userName, String choices) {
        final var existingUserChoice = userChoiceRepository.findByUserName(userName);
        final var currentTime = LocalDateTime.now();
        if (existingUserChoice.isPresent()) {
            UserChoice userChoice = existingUserChoice.get();
            userChoice.setChoices(choices);
            userChoice.setUpdatedOn(currentTime);
            userChoiceRepository.save(userChoice);
        } else {
            UserChoice newUserChoice = new UserChoice(userName, choices, currentTime, currentTime);
            userChoiceRepository.save(newUserChoice);
        }
    }
}