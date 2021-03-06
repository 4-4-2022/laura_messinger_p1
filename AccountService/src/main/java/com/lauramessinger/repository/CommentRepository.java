package com.lauramessinger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lauramessinger.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
