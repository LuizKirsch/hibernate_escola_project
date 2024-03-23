package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.example.entidades.Aluno;

import javax.swing.text.html.parser.Entity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        teste2();
    }

    private static void teste1() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("Escola").createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setNome("Luiz");
        aluno.setEndereco("rua");
        aluno.setCpf("32123423434");
        aluno.setNumeroMatricula("14567");

        entityManager.getTransaction().begin();
        entityManager.persist(aluno);
        entityManager.getTransaction().commit();
    }
    private static void teste2() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("Escola").createEntityManager();

        Aluno aluno = entityManager.find(Aluno.class, 1);
        aluno.setNome("editado");

        entityManager.getTransaction().begin();
        entityManager.merge(aluno);
        entityManager.getTransaction().commit();

//        tem que mudar para Array ao inves de ArrayList em Aluno , Contato e etc

    }
}
