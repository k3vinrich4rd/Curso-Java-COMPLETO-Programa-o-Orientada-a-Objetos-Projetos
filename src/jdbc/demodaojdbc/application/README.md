# Camada `application`

Esta pasta concentra a execução do exemplo.

## Papel da pasta

A classe `Program` instancia os DAOs por meio da `DaoFactory` e executa testes de consulta, inserção, atualização e remoção.

## O que observar

- a aplicação não acessa SQL diretamente;
- toda a persistência passa pelos DAOs;
- a saída no console ajuda a validar cada operação do módulo.

