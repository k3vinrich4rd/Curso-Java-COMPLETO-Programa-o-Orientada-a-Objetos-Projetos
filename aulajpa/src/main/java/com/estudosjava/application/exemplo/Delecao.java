package com.estudosjava.application.exemplo;


import com.estudosjava.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delecao {
    public static void main(String[] args) {

        // Cria uma fábrica de EntityManager com base na unidade de persistência definida no persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        // Cria um EntityManager a partir da fábrica, que será usado para interagir com o banco de dados
        EntityManager em = emf.createEntityManager();

        // Recupera uma pessoa do banco de dados pelo ID
        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin(); // Inicia uma transação para garantir que as operações de persistência sejam atômicas

        //Remove a pessoa do banco de dados
        //Mas antes de remover, verifica se a pessoa existe, pois só possível remover um objeto monitorado pelo EntityManager
        em.remove(p);
        em.getTransaction().commit(); // Confirma a transação, salvando as alterações no banco de dados

        System.out.println(p);
        System.out.println("Pessoa removida com sucesso!");
        em.close(); // Fecha o EntityManager para liberar recursos
        emf.close(); // Fecha a fábrica de EntityManager para liberar recursos

    }
}
