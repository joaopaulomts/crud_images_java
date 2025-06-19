Perfeito! Aqui está o seu código convertido em um arquivo `README.md` bem estruturado para colocar no GitHub:

---

# 🛍️ E-Commerce Product CRUD API

Uma API RESTful robusta e completa, construída com **Spring Boot**, que permite gerenciar produtos de um e-commerce, incluindo upload e armazenamento de imagens usando **MinIO**.

---

## ✨ Funcionalidades

* ✅ **CRUD Completo** — Criação, leitura, atualização e exclusão de produtos.
* 🖼️ **Upload de Imagens** — Armazenamento de imagens de produtos utilizando MinIO.
* 🔒 **Validação de Dados** — Garante a integridade dos dados usando Spring Validation.
* 📄 **Validação de Arquivos** — Garante que apenas imagens sejam enviadas (Apache Tika).
* 📑 **Paginação** — Listagem de produtos com paginação.
* 🗄️ **Banco em Memória (H2)** — Ideal para testes e desenvolvimento.

---

## 🚀 Tecnologias Utilizadas

* 🌱 **Spring Boot**
* 🗃️ **Spring Data JPA**
* 🐳 **Docker + Docker Compose**
* 📦 **MinIO** — Armazenamento de objetos
* 📄 **MapStruct** — Mapeamento de DTOs
* 🧩 **Lombok** — Redução de boilerplate
* 🔍 **Apache Tika** — Validação de tipos de arquivos
* 💾 **H2 Database** — Banco em memória para desenvolvimento

---

## ⚙️ Endpoints da API

| Método   | Endpoint         | Descrição                  |
| -------- | ---------------- | -------------------------- |
| `POST`   | `/products`      | Cria um novo produto       |
| `GET`    | `/products`      | Lista todos os produtos    |
| `GET`    | `/products/{id}` | Retorna um produto por ID  |
| `PUT`    | `/products/{id}` | Atualiza um produto por ID |
| `DELETE` | `/products/{id}` | Deleta um produto por ID   |

---

## 🏁 Como Rodar o Projeto

### 1️⃣ Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

---

### 2️⃣ Suba o MinIO com Docker

```bash
docker-compose up -d
```

> ⚠️ Acesse o MinIO em [http://localhost:9001](http://localhost:9001)
> Login: `ROOTUSER`
> Senha: `CHANGEME123`

**Crie um bucket chamado `images`** para que o upload funcione corretamente.

---

### 3️⃣ Execute a aplicação Spring Boot

Se estiver usando Maven:

```bash
./mvnw spring-boot:run
```

Ou pelo seu IDE (IntelliJ, VSCode, Eclipse).

---

## 🔗 Acesso à API

Por padrão a aplicação roda em:

```
http://localhost:8080
```

---

## 📂 Estrutura de Pastas (Simplificada)

```
src/
└── main/
    ├── java/
    │   └── com/
    │       └── ecommerce/
    │           ├── controller/
    │           ├── dto/
    │           ├── model/
    │           ├── repository/
    │           ├── service/
    │           └── EcommerceApplication.java
    └── resources/
        ├── application.yml
        └── static/
```

---
