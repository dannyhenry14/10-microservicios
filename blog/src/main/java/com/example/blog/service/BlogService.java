package com.example.blog.service;

import com.example.blog.dto.BlogDTO;
import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService {

    @Autowired
    private BlogRepository repo;

    public List<BlogDTO> obtenerTodos() {
        return repo.findAll().stream()
                .map(b -> new BlogDTO(b.getId(), b.getTitulo(), b.getContenido()))
                .collect(Collectors.toList());
    }

    public BlogDTO guardar(BlogDTO dto) {
        Blog blog = new Blog();
        blog.setTitulo(dto.getTitulo());
        blog.setContenido(dto.getContenido());

        Blog guardado = repo.save(blog);
        return new BlogDTO(guardado.getId(), guardado.getTitulo(), guardado.getContenido());
    }
}