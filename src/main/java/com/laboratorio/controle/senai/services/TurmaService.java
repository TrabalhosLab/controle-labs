package com.laboratorio.controle.senai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.controle.senai.models.Turma;
import com.laboratorio.controle.senai.repositories.TurmaRepository;


@Service
public class TurmaService {
    @Autowired
    public TurmaRepository turmaRepository;

    //count
    public Long count() {
        return turmaRepository.count();
    }

    //findById
    public Turma findById(Integer id) {
        return turmaRepository.findById(id).get();
    }

    //findAll
    public List<Turma> listar(){
            return turmaRepository.findAll();
    }

    //save
    public Turma salvar(Turma turma) {
        return turmaRepository.save(turma);
    }  

    //update
    public Turma save(Turma turma, Integer id) {
        Turma e = findById(id);
        if (e != null) {
            turma.setId(id);
            return turmaRepository.save(turma);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Turma turma = turmaRepository.findById(id).get();
        if(turma != null) {
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}