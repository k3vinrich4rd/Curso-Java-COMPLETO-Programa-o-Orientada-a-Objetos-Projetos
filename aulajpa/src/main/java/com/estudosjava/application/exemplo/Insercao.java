package com.estudosjava.application.exemplo;


import com.estudosjava.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insercao {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joquim@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");


        // Cria uma fábrica de EntityManager com base na unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        // Cria um EntityManager a partir da fábrica, que será usado para interagir com o banco de dados
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // Inicia uma transação para garantir que as operações de persistência sejam atômicas
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); // Confirma a transação, salvando as alterações no banco de dados
        System.out.println("Pessoa inserida com sucesso!");
        em.close(); // Fecha o EntityManager para liberar recursos
        emf.close(); // Fecha a fábrica de EntityManager para liberar recursos

    }
}
