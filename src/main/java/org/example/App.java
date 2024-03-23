package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import javax.swing.text.html.parser.Entity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManager entityManager = Persistence.createEntityManagerFactory("Escola").createEntityManager();

    }
}
