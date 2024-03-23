package org.example.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero_matricula")
    private String numeroMatricula;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nascimento")
    private LocalDate nascimento;

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "aluno"
    )

    private ArrayList<Contato> contatos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_turma",
        joinColumns = @JoinColumn(name = "aluno_id"),
        inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private ArrayList<Turma> turmas;


    public Aluno(int id, String nome, String numeroMatricula, String cpf, String endereco, LocalDate nascimento) {
        this.id = id;
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public Aluno() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getNascimento(LocalDate nascimento) {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public void setNascimento(int i, int i1, int i2) {
    }
}
