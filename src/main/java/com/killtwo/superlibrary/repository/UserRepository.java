package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User getByUserId(Integer userId);
}
