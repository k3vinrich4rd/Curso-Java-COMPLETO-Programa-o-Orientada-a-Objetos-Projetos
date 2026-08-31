# Demo DAO com JDBC

Este módulo organiza uma aplicação JDBC usando o padrão DAO.

## Objetivo do módulo

A proposta aqui é separar melhor as responsabilidades da aplicação:

- `application/` executa os testes de uso;
- `model/entities/` representa o domínio;
- `model/dao/` define os contratos de acesso a dados;
- `model/impl/` contém a implementação JDBC.

## O que este módulo ensina

- uso de `Connection`, `PreparedStatement` e `ResultSet`;
- operações CRUD com JDBC;
- reaproveitamento de conexão via classe utilitária `DB`;
- separação entre contrato e implementação com DAO;
- montagem de objetos de domínio a partir do banco.

## Ponto de entrada

A execução principal está em:

- [`application/Program.java`](application/Program.java)

## Entidades trabalhadas

- `Seller`
- `Department`

## Operações demonstradas

- `findById`
- `findAll`
- `findByDepartment`
- `insert`
- `update`
- `deleteById`

