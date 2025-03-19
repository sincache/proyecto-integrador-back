package org.generation.proyecto.integrador.controller;

import java.util.Iterator;
import java.util.List;

import org.generation.proyecto.integrador.model.Comment;
import org.generation.proyecto.integrador.model.User;
import org.generation.proyecto.integrador.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping("/doComment")
    public ResponseEntity<?> doComment(@RequestParam (name = "curso_id") Long idCurso){
		commentService.createComment(null);
		return  ResponseEntity.ok("");
	} 
	
	@GetMapping("/obtainComment/{curso_id}")
    public Page<Comment> obtainComment(@PathVariable("curso_id") Long idCurso){
		return commentService.getAllComments();
	}

	@PutMapping("deleteComment/{comentario_id}")
	public ResponseEntity<?> deleteComment(@PathVariable String comentario_id) {
		//TODO: process PUT request
		
		return ResponseEntity.ok("");
	}
	
	
	
	
}
