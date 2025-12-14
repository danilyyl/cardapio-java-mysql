#  Projeto Cardápio – Java + MySQL

Este projeto é uma aplicação simples em **Java** com integração ao **MySQL**, desenvolvida com o objetivo de **praticar conexão com banco de dados, DAO e consultas SQL**.

A aplicação realiza a leitura de dados de um cardápio armazenado no banco de dados e permite:

* Listar todos os itens
* Listar itens por categoria (ex: Pratos ou Bebidas)

---

##  Conceitos praticados

* JDBC (Java Database Connectivity)
* Conexão com MySQL
* Padrão DAO (Data Access Object)
* SQL com JOIN
* PreparedStatement
* Organização em camadas (app, dao, conexao)

---

## 🗂️ Estrutura do projeto

```
src/
 ├── app/
 │    └── TesteLeitura.java
 ├── dao/
 │    └── ItemCardapioDAO.java
 └── conexao/
      └── ConexaoMySQL.java
```

---

## 🗄️ Banco de dados

### Tabelas utilizadas:

**Categoria**

* id_categoria (PK)
* nome

**ItemCardapio**

* id_item (PK)
* nome
* preco
* id_categoria (FK)

---

## ▶️ Como executar

1. Configure o MySQL localmente
2. Crie as tabelas conforme a estrutura acima
3. Ajuste as credenciais no arquivo `ConexaoMySQL.java`
4. Execute a classe `TesteLeitura`
5. Escolha a categoria no terminal

---

##  Exemplo de saída

```
=== CARDÁPIO ===
1 - Pratos
2 - Bebidas
Escolha a categoria: 2
[Bebidas] Suco Natural - R$ 6.50
[Bebidas] Refrigerante - R$ 5.00
```

---

## ✨ Considerações

Este projeto faz parte dos meus estudos em **Java e Banco de Dados**, com foco em consolidar a base antes de avançar para aplicações maiores.

📌 Feedbacks são bem-vindos!
