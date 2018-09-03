package com.amitbansal.spring.restfuldemo.jpa.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
