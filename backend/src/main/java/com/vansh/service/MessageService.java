package com.vansh.service;

import java.util.List;

import com.vansh.exception.ChatException;
import com.vansh.exception.ProjectException;
import com.vansh.exception.UserException;
import com.vansh.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

