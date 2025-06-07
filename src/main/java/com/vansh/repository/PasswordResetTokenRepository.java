package com.vansh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vansh.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
