# Herança e Polimorfismo

Esta pasta reúne estudos sobre reutilização de código e especialização de classes em Java.

## Objetivo do módulo

O foco aqui é entender como a orientação a objetos evolui com:

- herança;
- sobrescrita de métodos;
- reutilização de comportamento;
- polimorfismo;
- variações de especialização em classes derivadas.

## Lógica das subpastas e arquivos

### `entities/`
Área principal do módulo, com classes de domínio que representam a hierarquia estudada.

Dentro dela aparecem exemplos como:

- `Account.java`
- `BusinessAccount.java`
- `SavingsAccount.java`
- `SavingsAccountPlus.java`

Esses arquivos ajudam a visualizar como uma classe base pode ser especializada e como o comportamento muda conforme o tipo concreto do objeto.

Também há classes de execução, como:

- `AccountMain.java`
- `AccountMain2.java`
- `AccountMain3.java`

## Ordem sugerida de estudo

1. classe base (`Account`)
2. especializações (`BusinessAccount`, `SavingsAccount`)
3. classes de execução (`AccountMain*`)
4. demais exercícios e variações internas

## O que este módulo agrega ao projeto

Esse módulo fortalece a compreensão de modelagem orientada a objetos e prepara a base para entender melhor abstração, interfaces e organização de domínio.

