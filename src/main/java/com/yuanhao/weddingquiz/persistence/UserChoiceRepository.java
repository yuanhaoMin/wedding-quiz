package com.yuanhao.weddingquiz.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserChoiceRepository extends JpaRepository<UserChoice, Long> {

    Optional<UserChoice> findByUserName(String userName);

}