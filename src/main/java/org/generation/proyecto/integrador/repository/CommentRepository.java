package org.generation.proyecto.integrador.repository;

import java.util.Date;
import java.util.Set;

import javax.xml.stream.events.Comment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends CrudRepository <Comment, Long>, PagingAndSortingRepository<Comment, Long>{
	Set<Comment> findByCreationDate(Date creationDate);
	Set <Comment> findByUser(Date user); 
}
