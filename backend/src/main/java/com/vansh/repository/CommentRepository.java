package com.vansh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vansh.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByIssueId(Long issueId);
}

