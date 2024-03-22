package com.yuanhao.weddingquiz.controller;

public class UserChoiceRequestDto {
    private String userName;
    private String choices;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }
}