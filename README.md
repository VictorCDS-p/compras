---

# 📦 Aplicação de Compras com Cartão de Crédito (Java)

Este projeto é uma aplicação simples em Java que simula o uso de um **cartão de crédito**, permitindo o lançamento de compras até que o limite disponível seja atingido.

---

## 🎯 Funcionalidades

* Definir o limite do cartão de crédito
* Registrar compras com descrição e valor
* Validar entradas do usuário (evita erros de digitação)
* Impedir compras que ultrapassem o saldo disponível
* Armazenar as compras em uma lista
* Exibir as compras ordenadas por valor
* Mostrar o saldo final do cartão

---

## 🛠️ Tecnologias e conceitos utilizados

* Java
* `Scanner`
* `List` e `ArrayList`
* `Comparable`
* `Collections.sort()`
* Encapsulamento
* Estruturas de repetição (`while`)
* Validação de entrada de dados

---

## 📂 Estrutura do projeto

```
src/
 ├── Main.java
 ├── br/com/desafio/alura/compra/
 │    └── Compra.java
 └── br/com/desafio/alura/cartão/
      └── CartaoCredito.java
```

---

## ▶️ Como executar

1. Abra o projeto no IntelliJ IDEA (ou outra IDE Java)
2. Execute a classe `Main`
3. Siga as instruções exibidas no terminal

---

## 📌 Exemplo de uso

```
Digite o limite do cartão: 1000
Digite a descrição da compra: sapato
Digite o valor da compra: 150
Compra realizada!
Digite 0 para sair ou 1 para continuar
```
