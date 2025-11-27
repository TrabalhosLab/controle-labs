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
@Table
public class Laboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="numero")
    private Integer numero;

    @Column(name="lugar")
    private Integer lugar;

    @Column(name="capacidade")
    private Integer capacidade;

    @ManyToMany
    @JoinTable(
        name = "Turma",
        joinColumns = @JoinColumn(name = "laboratorio_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "turma_id", referencedColumnName = "id")
    )
    private Set<Turma> turma;

    public Laboratorio() {
    }

    public Laboratorio(Integer id, Integer numero, Integer lugar, Integer capacidade, Set<Turma> turma) {
        this.id = id;
        this.numero = numero;
        this.lugar = lugar;
        this.capacidade = capacidade;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getLugar() {
        return lugar;
    }

    public void setLugar(Integer lugar) {
        this.lugar = lugar;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Set<Turma> getTurma() {
        return turma;
    }

    public void setTurma(Set<Turma> turma) {
        this.turma = turma;
    }

}