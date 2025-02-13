package com.wipro.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springsecurity.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

		public UserEntity		findByUsername(String username);
	
}
