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

import com.laboratorio.controle.senai.models.Turma;
import com.laboratorio.controle.senai.services.TurmaService;



@RestController
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    public TurmaService turmaService;

    //count
    @GetMapping("/count")
    public Long count() {
        return turmaService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Turma find(@PathVariable Integer id) {
        return turmaService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Turma> list() {
        return turmaService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Turma save(@PathVariable Integer id, @RequestBody Turma turma){
        return turmaService.save(turma, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = turmaService.delete(id);
        if (deletou) {
            return "Turma indisponível com sucesso";
        }
        return "Falha ao indisponibilizar o turma";
    }
}