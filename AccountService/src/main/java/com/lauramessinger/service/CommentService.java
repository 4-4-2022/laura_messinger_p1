package com.lauramessinger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lauramessinger.entity.Comment;
import com.lauramessinger.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository repo;
	
	public void save(Comment comment) {
		repo.save(comment);
	}
	
}
