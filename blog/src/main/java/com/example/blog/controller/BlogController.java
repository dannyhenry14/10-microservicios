package com.example.blog.controller;

import com.example.blog.dto.BlogDTO;
import com.example.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService service;

    @GetMapping
    public ResponseEntity<List<BlogDTO>> listar() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PostMapping
    public ResponseEntity<BlogDTO> crear(@RequestBody BlogDTO dto) {
        return ResponseEntity.ok(service.guardar(dto));
    }
}
