# Estrutura de Estudos do `src`

Este diretório reúne os conteúdos do curso em uma trilha prática de evolução em Java.

## Objetivo desta organização

A ideia desta estrutura é facilitar três coisas:

1. **estudo progressivo** por assunto;
2. **manutenção futura** do repositório com novos conteúdos;
3. **acesso rápido** para quem chegar pelo GitHub ou por uma publicação no LinkedIn.

## Como navegar

Antes de percorrer as pastas, vale consultar estes apoios:

- [`GUIA_DE_COMENTARIOS.md`](GUIA_DE_COMENTARIOS.md)
- [`programacaofuncionaleexpressoeslambda/README.md`](programacaofuncionaleexpressoeslambda/README.md)

### 1. Fundamentos de lógica e estrutura da linguagem
- `estruturasequencial/`
- `estrutruracondicional/`
- `estruturarepetitiva/`
- `exerciciosdelogica/`
- `funcoesmatematicas/`
- `funcoesstring/`
- `dataehora/`
- `BitWise.java`
- `FuncoesJava.java`

### 2. Estruturas de dados básicas
- `vetores/`
- `matrizes/`
- `listas/`

### 3. Programação orientada a objetos
- `poo/`
- `enumeracoes/`
- `herancaepolimorfismo/`
- `interfaces/`
- `entities/`

### 4. Coleções e recursos genéricos
- `set/`
- `map/`
- `genericssetmap/`

### 5. Exceções e tratamento de erros
- `tratamentodeexcecoes/`

### 6. Programação funcional e expressões lambda
- `programacaofuncionaleexpressoeslambda/`

## Lógica sugerida para evolução das subpastas

Para manter o projeto acessível conforme novos conteúdos forem sendo adicionados, a recomendação é seguir estas regras:

### Regra 1 — manter nomes por assunto
Cada pasta principal deve representar um **tema de estudo**.

### Regra 2 — separar exemplos, demos e exercícios
Dentro de cada tema, quando o conteúdo crescer, o ideal é manter um padrão como:

- `exemplos/`
- `exercicios/`
- `resolucoes/`
- `entities/`
- `application/`

### Regra 3 — evitar arquivos soltos na raiz do `src`
Arquivos isolados como `BitWise.java` e `FuncoesJava.java` podem futuramente ser movidos para uma pasta de fundamentos, para deixar a navegação mais limpa.

### Regra 4 — usar comentários enxutos
Os arquivos devem priorizar:
- objetivo da classe;
- conceito principal estudado;
- explicação breve de trechos importantes;
- evitar comentários redundantes linha a linha quando a leitura do código já estiver clara.

## Ajustes estruturais recomendados no futuro

Sem quebrar o projeto agora, estes são os principais ajustes desejáveis:

- corrigir nomes inconsistentes, como `estrutruracondicional/`;
- revisar nomes de pacotes com grafia inconsistente;
- padronizar subpastas com `application`, `entities`, `services` e `util` quando o assunto exigir;
- documentar cada módulo mais importante com um pequeno README próprio.

## Prioridade recomendada de reorganização

1. `programacaofuncionaleexpressoeslambda/`
2. `interfaces/`
3. `genericssetmap/`
4. `tratamentodeexcecoes/`
5. `poo/`

Essas áreas costumam concentrar mais exemplos, mais abstrações e mais valor didático para quem revisa o repositório.

## Documentação modular já iniciada

As pastas que já passam a seguir a mesma lógica de documentação são:

- [`programacaofuncionaleexpressoeslambda/README.md`](programacaofuncionaleexpressoeslambda/README.md)
- [`interfaces/README.md`](interfaces/README.md)
- [`genericssetmap/README.md`](genericssetmap/README.md)
- [`tratamentodeexcecoes/README.md`](tratamentodeexcecoes/README.md)
- [`poo/README.md`](poo/README.md)
- [`set/README.md`](set/README.md)
- [`map/README.md`](map/README.md)
- [`herancaepolimorfismo/README.md`](herancaepolimorfismo/README.md)
- [`enumeracoes/README.md`](enumeracoes/README.md)
- [`dataehora/README.md`](dataehora/README.md)
- [`funcoesstring/README.md`](funcoesstring/README.md)
- [`funcoesmatematicas/README.md`](funcoesmatematicas/README.md)
- [`vetores/README.md`](vetores/README.md)
- [`matrizes/README.md`](matrizes/README.md)
- [`listas/README.md`](listas/README.md)
- [`estruturasequencial/README.md`](estruturasequencial/README.md)
- [`estruturarepetitiva/README.md`](estruturarepetitiva/README.md)
- [`estrutruracondicional/README.md`](estrutruracondicional/README.md)
- [`exerciciosdelogica/README.md`](exerciciosdelogica/README.md)
- [`entities/README.md`](entities/README.md)

## Como este projeto pode ser apresentado publicamente

Este repositório pode ser divulgado como:

- uma trilha prática de formação em Java;
- um material de revisão para quem está estudando fundamentos até tópicos intermediários;
- um registro de evolução técnica com exemplos, exercícios e resoluções comentadas.

## Intenção futura

Este `src` foi pensado para continuar crescendo.
Por isso, a prioridade não é apenas resolver exercícios, mas também construir um acervo acessível para:

- revisão pessoal;
- compartilhamento com a comunidade;
- apoio para estudantes iniciantes;
- fortalecimento do portfólio profissional.






