package org.generation.proyecto.integrador.service;

import java.util.Date;
import java.util.Set;

import org.generation.proyecto.integrador.model.Comment;

public interface CommentService {
	
	Comment createComment(Comment comment);
	Comment getCommentById(Long id);
	Comment getCommentCreationDate(Date creationDate);
	Comment getCommentContent(String content);
	Comment getCommentAuthor(String author);
	Comment getCommentRaiting(Integer rating);
	Set<Comment> getAllComments();
	Comment updateComment(Comment comment, Long id, Date creationDate, String Content, Integer raiting);
	void deleteComment(Long id);
}
