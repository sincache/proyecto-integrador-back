package org.generation.proyecto.integrador.service;

import java.util.Iterator;

import org.generation.proyecto.integrador.model.Comment;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@Service
public interface CommentService {
	
	Comment createComment(Comment comment);
	Page <Comment> getAllComments();
	void deleteComment(Long id);
}
