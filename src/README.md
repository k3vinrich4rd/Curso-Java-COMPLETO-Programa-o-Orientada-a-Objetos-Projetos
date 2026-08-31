# Guia de navegação do `src`

Esta pasta concentra os conteúdos-fonte do repositório, organizados por tema para facilitar estudo, revisão e evolução gradual.

## Trilhas principais

### Fundamentos
- `estruturasequencial/`
- `estrutruracondicional/`
- `estruturarepetitiva/`
- `exerciciosdelogica/`
- `funcoesstring/`
- `funcoesmatematicas/`
- `dataehora/`

### Programação orientada a objetos
- `poo/`
- `enumeracoes/`
- `herancaepolimorfismo/`
- `interfaces/`

### Estruturas de dados e coleções
- `vetores/`
- `matrizes/`
- `listas/`
- `set/`
- `map/`
- `genericssetmap/`

### Programação funcional
- `programacaofuncionaleexpressoeslambda/`

### JDBC
- `jdbc/`

## Aplicação JDBC em destaque

Se a ideia for estudar uma aplicação mais estruturada, o melhor ponto de entrada é:

- [`jdbc/demodaojdbc/`](jdbc/demodaojdbc/)

Esse módulo demonstra o uso de JDBC com padrão DAO, separando:

- `application/` para execução dos testes de uso;
- `model/entities/` para as entidades do domínio;
- `model/dao/` para os contratos;
- `model/impl/` para a implementação JDBC.

## Sugestão de uso

1. escolha um tema;
2. leia o `README.md` do módulo;
3. avance das classes mais simples para as mais completas;
4. use os comentários do código como apoio, não como substituto da prática.

