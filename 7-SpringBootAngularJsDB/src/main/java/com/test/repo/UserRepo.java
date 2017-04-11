package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.bean.User;

public interface UserRepo extends JpaRepository<User, String> {

}
