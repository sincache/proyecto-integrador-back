package org.generation.proyecto.integrador.service;

import java.util.Iterator;

import org.generation.proyecto.integrador.model.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
	
	Comment createComment(Comment comment);
	Iterator <Comment> getAllComments();
	void deleteComment(Long id);
}
