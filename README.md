# Trabalho Prático 04 - Classe Data

## Descrição

Este projeto foi desenvolvido em Java como atividade prática da disciplina de Programação Orientada a Objetos. O objetivo é implementar uma classe `Data` capaz de representar uma data válida e disponibilizar métodos para manipulação e exibição de informações relacionadas ao calendário.

## Funcionalidades

* Construtores com e sem parâmetros.
* Validação de dia, mês e ano.
* Verificação automática de anos bissextos.
* Retorno dos valores de dia, mês e ano.
* Exibição da data no formato `dd/mm/aaaa`.
* Exibição da data com o mês por extenso.
* Cálculo da quantidade de dias transcorridos no ano.
* Apresentação da data atual utilizando as classes `Date` e `DateFormat`.

## Tecnologias

* Java
* Programação Orientada a Objetos

## Estrutura da Classe

A classe `Data` possui os seguintes atributos:

* `dia`
* `mes`
* `ano`

E os principais métodos:

* `Data()`
* `Data(int d, int m, int a)`
* `entraDia()`
* `entraMes()`
* `entraAno()`
* `entraDia(int d)`
* `entraMes(int m)`
* `entraAno(int a)`
* `retDia()`
* `retMes()`
* `retAno()`
* `mostra1()`
* `mostra2()`
* `bissexto()`
* `diasTranscorridos()`
* `apresentaDataAtual()`

## Objetivo

Aplicar conceitos de encapsulamento, sobrecarga de métodos e construtores, validação de dados e manipulação de datas em Java por meio da implementação de uma classe reutilizável.
