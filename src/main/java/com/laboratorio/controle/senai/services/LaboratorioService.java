package com.laboratorio.controle.senai.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laboratorio.controle.senai.models.Laboratorio;
import com.laboratorio.controle.senai.repositories.LaboratorioRepository;


@Service
public class LaboratorioService {
    @Autowired
    public LaboratorioRepository laboratorioRepository;

    //count
    public Long count() {
        return laboratorioRepository.count();
    }

    //findById
    public Laboratorio findById(Integer id) {
        return laboratorioRepository.findById(id).get();
    }

    //findAll
    public List<Laboratorio> listar(){
            return laboratorioRepository.findAll();
    }

    //save
    public Laboratorio salvar(Laboratorio laboratorio) {
        return laboratorioRepository.save(laboratorio);
    }  

    //update
    public Laboratorio save(Laboratorio laboratorio, Integer id) {
        Laboratorio e = findById(id);
        if (e != null) {
            laboratorio.setId(id);
            return laboratorioRepository.save(laboratorio);
        }
        return null;
    }

    //delete
    public boolean delete(Integer id) {
        Laboratorio laboratorio = laboratorioRepository.findById(id).get();
        if(laboratorio != null) {
            laboratorioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}