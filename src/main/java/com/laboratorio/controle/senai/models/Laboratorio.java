package com.laboratorio.controle.senai.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="laboratorio")
public class Laboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="numero")
    private String numero;

    @Column(name="lugar")
    private String lugar;

    @Column(name="capacidade")
    private String capacidade;

    @ManyToMany
    @JoinTable(
        name = "laboratorio_professor",
        joinColumns = @JoinColumn(name = "laboratorio_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "professor_id", referencedColumnName = "id")
    )
    private Set<Professor> professor;

    public Laboratorio() {
    }

    public Laboratorio(Integer id, String numero, String lugar, String capacidade, Set<Professor> professor) {
        this.id = id;
        this.numero = numero;
        this.lugar = lugar;
        this.capacidade = capacidade;
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public Set<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(Set<Professor> professor) {
        this.professor = professor;
    }

}