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

import com.laboratorio.controle.senai.models.Professor;
import com.laboratorio.controle.senai.services.ProfessorService;




@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    public ProfessorService professorService;

    //count
    @GetMapping("/count")
    public Long count() {
        return professorService.count();
    }

    //findById
    @GetMapping("/find/{id}")
    public Professor find(@PathVariable Integer id) {
        return professorService.findById(id);
    }

    //findAll
    @GetMapping("/list")
    public List<Professor> list() {
        return professorService.listar();
    }

    //save
    @PostMapping("/salvar")
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }

    //update
    @PutMapping("/atualizar/{id}")
    public Professor save(@PathVariable Integer id, @RequestBody Professor professor){
        return professorService.save(professor, id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean deletou = professorService.delete(id);
        if (deletou) {
            return "Professor indisponível com sucesso";
        }
        return "Falha ao indisponibilizar o professor";
    }
}