# AulaRest API

Este é um projeto de API RESTful desenvolvido em **Java** com **Spring Boot**, que gerencia um cadastro de produtos. Ele inclui funcionalidades para listar, buscar, criar, atualizar e excluir produtos em um banco de dados relacional.

---

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (ou outro banco relacional à sua escolha)
- **Maven** para gerenciamento de dependências

---

## Funcionalidades

### **Endpoints**

#### **Produtos**

- **GET /produtos**  
  Retorna uma lista de todos os produtos cadastrados.

- **GET /produtos/{codigo}**  
  Retorna os detalhes de um produto específico pelo seu código.

- **POST /produtos**  
  Cria um novo produto.  
  **Exemplo de corpo da requisição**:
  ```json
  {
      "nome": "Chinelo",
      "categoria": 1,
      "temLojaFisica": "S",
      "quantidade": 10,
      "preco": 19.99,
      "dataValidade": "2025-12-31",
      "descricao": "Chinelo confortável"
  }

- **PUT /produtos/atualizar/{codigo}**

    Atualiza os dados de um produto existente.

    **Exemplo de corpo da requisição**:

  ```json
  {
      "nome": "Chinelo",
      "categoria": 1,
      "temLojaFisica": "S",
      "quantidade": 10,
      "preco": 19.99,
      "dataValidade": "2025-12-31",
      "descricao": "Chinelo confortável"
  } 
  ```
  - **DELETE /produtos/{codigo}**

  Remove um produto existente pelo código. O nome do produto excluído será marcado com *DELETED* como uma forma de registro temporário

# Como Executar
- Certifique-se de que você tenha Java 17 ou superior instalado.
- Clone este repositório:
```
git clone https://github.com/JavaScript-Py/aula-rest.git
```
- Acesse o diretório do projeto:

```
cd AulaRest
```
- Compile e execute o projeto usando o Maven:
```
./mvnw spring-boot:run
```

- Acesse a API em http://localhost:8080.




