package com.example.talleres.repository;

import com.example.talleres.model.Taller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TallerRepository extends JpaRepository<Taller, Long> {
}