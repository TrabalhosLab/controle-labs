package com.laboratorio.controle.senai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.controle.senai.models.Professor;
import com.laboratorio.controle.senai.repositories.ProfessorRepository;


@Service
public class ProfessorService {
    @Autowired
    public ProfessorRepository professorRepository;

    //count
    public Long count() {
        return professorRepository.count();
    }

    //findById
    public Professor findById(Integer id) {
        return professorRepository.findById(id).get();
    }

    //findAll
    public List<Professor> listar(){
            return professorRepository.findAll();
    }

    //save
    public Professor salvar(Professor professor) {
        return professorRepository.save(professor);
    }  

    //update
    public Professor save(Professor professor, Integer id) {
        Professor e = findById(id);
        if (e != null) {
            professor.setId(id);
            return professorRepository.save(professor);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Professor professor = professorRepository.findById(id).get();
        if(professor != null) {
            professorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}