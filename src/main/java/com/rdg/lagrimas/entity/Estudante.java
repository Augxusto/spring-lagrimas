package com.rdg.lagrimas.entity;

import jakarta.persistence.*;


@Entity(name = "Estudante")
@Table(name = "tb_aluno")
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo")
    private String nome;
    @Column(name = "email_aluno")
    private String email;
    private Integer idade;

    public Estudante() {
    }
    
    public Estudante(Long id, String nome, String email, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
