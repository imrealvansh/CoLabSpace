package com.vansh.service;

import com.vansh.exception.IssueException;
import com.vansh.exception.UserException;
import com.vansh.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
