package com.laboratorio.controle.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laboratorio.controle.senai.models.Professor;


@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}