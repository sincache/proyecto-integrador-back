package org.generation.proyecto.integrador.service.impl;

import org.generation.proyecto.integrador.model.Comment;
import org.generation.proyecto.integrador.service.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/comment")
public class CommentServiceImpl implements CommentService{

    @Override
    public Comment createComment(Comment comment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createComment'");
    }

    @Override
    public Page<Comment> getAllComments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllComments'");
    }

    @Override
    public void deleteComment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteComment'");
    }

}
