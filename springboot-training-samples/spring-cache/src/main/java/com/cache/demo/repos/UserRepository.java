package com.cache.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cache.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
