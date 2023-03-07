package com.microservices.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,	Long>{
	User findByUserId(Long userId);

	public Optional<User> findByUserId(String userName);

	
}
