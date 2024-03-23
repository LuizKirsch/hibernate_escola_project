package org.example.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "semestre")
    private String semestre;

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_turma",
        joinColumns = @JoinColumn(name = "turma_id"),
        inverseJoinColumns = @JoinColumn(name = "aluno_id"))
    private ArrayList<Aluno> alunos;

//    @Column(name = "professor_id ")
//    private int professor_id ;


    public Turma(String semestre) {
        this.semestre = semestre;
    }

    public Turma() {

    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", semestre='" + semestre + '\'' +
                '}';
    }


}
