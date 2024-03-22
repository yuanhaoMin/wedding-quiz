package com.yuanhao.weddingquiz.persistence;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_choices")
public class UserChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false, length = 255)
    private String userName;

    @Column(name = "choices")
    private String choices;

    @Column(name = "created_on", nullable = false)
    private LocalDateTime createdOn;

    @Column(name = "updated_on", nullable = true)
    private LocalDateTime updatedOn;

    public UserChoice() {
    }

    public UserChoice(String userName, String choices, LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.userName = userName;
        this.choices = choices;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}