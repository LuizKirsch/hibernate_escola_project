package org.example.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "semestre")
    private String semestre;

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
