
```markdown
# Payment System - Spring Boot Project

## Especificações do Projeto

Este projeto é uma API RESTful construída com **Spring Boot** e **MongoDB** para gerenciar produtos e promoções. A aplicação utiliza o **Java 17** e o gerenciador de dependências **Maven**.

### Informações do Projeto
- **Framework**: Spring Boot 3.3.3
- **Gerenciador de Projeto**: Maven
- **Linguagem**: Java 17
- **Banco de Dados**: MongoDB (NoSQL)

### Dependências Utilizadas:
- **Spring Boot Starter Data MongoDB**: Para integração com o banco de dados MongoDB.
- **Spring Boot Starter Web**: Para construção da API REST.
- **Lombok**: Para reduzir o boilerplate de código (getters, setters, etc.).

## Configuração do Banco de Dados

O projeto utiliza o MongoDB como banco de dados NoSQL. Para rodar o MongoDB via Docker, execute o seguinte comando para criar o container:

```bash
docker run -d --name mongodb-container -p 27017:27017 \
  -e MONGO_INITDB_ROOT_USERNAME=admin \
  -e MONGO_INITDB_ROOT_PASSWORD=password \
  mongo:latest
```

Após a criação do container, recomenda-se utilizar o **MongoDB Compass** ou qualquer outra ferramenta gráfica de sua escolha para visualizar os dados transacionados no banco de dados.

### Configurações de Conexão

As configurações do banco de dados estão definidas no arquivo `application.yml`:

```yaml
spring:
  data:
    mongodb:
      host: localhost
      port: 27017
      database: productdb
      username: admin
      password: admin
```

> **Nota**: O banco de dados deve estar rodando para que o build e a execução do projeto ocorram corretamente.

## Instruções de Build e Execução

Para baixar todas as dependências e compilar o projeto, execute o seguinte comando:

```bash
mvn clean install -DskipTests=true
```

Esse comando irá compilar o projeto e pular a execução dos testes.

## Endpoints da API

A seguir estão detalhados os principais endpoints disponíveis na API:

### Endpoints Requeridos

#### 1. Inserção de Produtos

- **Método**: `POST`
- **Rota**: `/products`
- **Descrição**: Insere um novo produto no banco de dados.

#### 2. Inserção de Promoções para Produtos

- **Método**: `POST`
- **Rota**: `/promotions/{productId}`
- **Descrição**: Insere uma promoção associada a um produto específico.

### Endpoints Adicionais

#### 3. Inserção em Massa de Produtos

- **Método**: `POST`
- **Rota**: `/products/bulk`
- **Descrição**: Insere vários produtos em massa.

#### 4. Recuperar Todos os Produtos

- **Método**: `GET`
- **Rota**: `/products`
- **Descrição**: Retorna todos os produtos e promoções cadastrados.

#### 5. Recuperar Produtos sem Promoções

- **Método**: `GET`
- **Rota**: `/products/nopromotions`
- **Descrição**: Retorna todos os produtos que não têm promoções associadas.

#### 6. Recuperar Produto por ID

- **Método**: `GET`
- **Rota**: `/products/{id}`
- **Descrição**: Retorna as informações de um produto específico com base no ID fornecido.

## Documentação da API

A documentação completa da API pode ser acessada pelo Swagger UI através do seguinte endereço:

[http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

## Contribuições

Este projeto está aberto para contribuições. Caso encontre algum problema ou queira sugerir melhorias, fique à vontade para abrir um pull request ou uma issue no repositório.

---

### Autor

Projeto desenvolvido pela equipe da QikServe para gerenciamento de produtos e promoções em um sistema de pagamentos.
```

