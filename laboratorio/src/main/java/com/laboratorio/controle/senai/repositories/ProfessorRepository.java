package com.laboratorio.controle.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.laboratorios.atividades.grupo.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}