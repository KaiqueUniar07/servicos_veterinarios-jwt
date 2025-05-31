# Sistema de Gerenciamento de Serviços Veterinários 

Este projeto é composto por 4 APIs com Spring Boot e banco de dados MongoDB. O sistema permite o gerenciamento completo de usuários, animais, pessoas e serviços veterinários.

## APIs Disponíveis

- Auth API: Realiza o cadastro e login de usuários, gerando o token JWT.
- Animal API: Permite cadastrar e listar animais, protegida por autenticação JWT.
- Pessoa API: Gerencia pessoas (nome, CPF, telefone, endereço) e associações com animais.
- Serviço API: Registra serviços prestados aos animais, como consultas, vacinas e cirurgias.

## Como rodar o projeto

1. Pré-requisitos:
   - Java 17+
   - Maven 3.8+
   - MongoDB em execução (localhost:27017)

2.  Passos:
   - Clone o repositório;
 
   - Acesse cada pasta de API individualmente e rode;
   
   - As portas padrão são:
     - Auth API: 8081
     - Animal API: 8082
     - Pessoa API: 8083
     - Serviço API: 8084.
