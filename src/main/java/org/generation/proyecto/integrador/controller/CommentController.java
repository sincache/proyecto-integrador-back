package org.generation.proyecto.integrador.controller;

import java.util.Iterator;
import java.util.List;

import org.generation.proyecto.integrador.model.Comment;
import org.generation.proyecto.integrador.model.User;
import org.generation.proyecto.integrador.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping("/comenta")
    public ResponseEntity<Iterator<Comment>> comentar(@RequestParam (name = "curso_id") Long idCurso){
		return  ResponseEntity.ok(commentService.createComment());
	} 
	
	@GetMapping("/obtener-comentarios")
    public ResponseEntity<Iterator<Comment>> obtenerComentarios(@RequestParam (name = "curso_id") Long idCurso){
		return  ResponseEntity.ok(commentService.getAllComments());
	}
	
	
	
	
}
