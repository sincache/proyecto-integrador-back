package org.generation.proyecto.integrador.service;

import java.util.Set;

import org.generation.proyecto.integrador.model.Comment;

public interface CommentService {
	
	Comment createComment(Comment comment);
	Set<Comment> getAllComments();
	void deleteComment(Long id);
}
