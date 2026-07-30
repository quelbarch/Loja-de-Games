# 🎮 Loja de Games - API RESTful

<p align="center">
  <b>Desenvolvido por Raquel Barch 👩‍💻</b><br>
  <i>Projeto prático de Backend desenvolvido durante o bootcamp da Generation Brasil.</i>
</p>

<p align="center">
  <a href="#-autora">
    <img src="https://img.shields.io/badge/Autora-Raquel_Barch-purple?style=for-the-badge" alt="Autora">
  </a>
  <a href="https://github.com/quelbarch">
    <img src="https://img.shields.io/badge/GitHub-quelbarch-181717?style=for-the-badge&logo=github" alt="GitHub">
  </a>
</p>

---

## 📌 Sobre o Projeto

O **Loja de Games** é um sistema backend completo que simula o ecossistema de um e-commerce de jogos. A aplicação conta com controle de acesso, persistência de dados em banco relacional e segurança integrada via tokens JWT.

### 🚀 Funcionalidades Principais
- 🔐 **Autenticação e Segurança:** Cadastro de usuários, login e geração de Token JWT.
- 👤 **Gerenciamento de Usuários:** Listagem, busca por ID, cadastro e atualização de perfil.
- 🛍️ **CRUDs de Produtos e Categorias:** Gerenciamento de itens e suas respectivas categorias no catálogo.
- 📖 **Documentação de API:** Integração com Swagger/OpenAPI para testes de endpoints.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot 3.x
- **Segurança:** Spring Security & JWT (JSON Web Token)
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Banco de Dados:** MySQL
- **Validação de Dados:** Jakarta Validation
- **Documentação:** Swagger / OpenAPI 3
- **Gerenciador de Dependências:** Maven

---

## 🔐 Endpoints da API (Usuários)

| Método | Rota | Descrição | Acesso |
| :--- | :--- | :--- | :--- |
| `POST` | `/usuarios/cadastrar` | Cadastra um novo usuário no sistema | Público |
| `POST` | `/usuarios/logar` | Autentica o usuário e retorna o Token JWT | Público |
| `GET` | `/usuarios/all` | Lista todos os usuários cadastrados | Protegido (JWT) |
| `GET` | `/usuarios/{id}` | Busca um usuário específico pelo ID | Protegido (JWT) |
| `PUT` | `/usuarios/atualizar` | Atualiza os dados de um usuário existente | Protegido (JWT) |

---

## 📂 Estrutura do Banco de Dados (`tb_usuarios`)

```sql
- id (BIGINT, PK, Auto Increment)
- nome (VARCHAR 255, NOT NULL)
- usuario (VARCHAR 255, NOT NULL, EMAIL)
- senha (VARCHAR 255, NOT NULL)
- foto (VARCHAR 5000)
- data_nascimento (DATE)
