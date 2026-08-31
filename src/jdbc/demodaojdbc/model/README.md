# Camada `model`

Esta pasta concentra a parte central do domínio e do acesso a dados.

## Organização interna

- `entities/` representa os objetos do domínio;
- `dao/` define as interfaces com as operações esperadas;
- `impl/` implementa essas operações usando JDBC.

## Ideia principal

A aplicação depende das interfaces DAO, enquanto a implementação concreta fica isolada na pasta `impl/`.

