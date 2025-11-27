package com.laboratorio.controle.senai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.laboratorios.atividades.grupo.models.Laboratorio;
import com.controle.laboratorios.atividades.grupo.services.LaboratorioService;

@RestController
@RequestMapping("/laboratorio")
public class LaboratorioController {
    @Autowired
    public LaboratorioService laboratorioService;

    //count
    @GetMapping("/count")
    public Long count() {
        return laboratorioService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Laboratorio find(@PathVariable Integer id) {
        return laboratorioService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Laboratorio> list() {
        return laboratorioService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Laboratorio salvar(@RequestBody Laboratorio laboratorio) {
        return laboratorioService.salvar(laboratorio);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Laboratorio save(@PathVariable Integer id, @RequestBody Laboratorio laboratorio){
        return laboratorioService.save(laboratorio, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = laboratorioService.delete(id);
        if (deletou) {
            return "Laboratorio indisponível com sucesso";
        }
        return "Falha ao indisponibilizar o laboratorio";
    }
}