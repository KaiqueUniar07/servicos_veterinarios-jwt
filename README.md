# Sistema de Gerenciamento de Serviços Veterinários 

Este projeto é composto por 4 APIs com Spring Boot e banco de dados MongoDB. O sistema permite o gerenciamento completo de usuários, animais, pessoas e serviços veterinários.

# Grupo:
● RA: 04722-035 / Éric D’Andrea Rapatão
● RA: 04722-083 / Gerônimo Van-Dick Rizzo Bortolozzo
● RA: 04722-039 / Kaique Rapatoni Santana
● RA: 04722-025 / Murilo Cabral Paulino
● RA: 04722-070 / Rafael Rogério Mariano Eduardo
● RA: 04722-065 / Vinicius Credi



## APIs Disponíveis

- Auth API: Realiza o cadastro e login de usuários, gerando o token JWT.
- Animal API: Permite cadastrar e listar animais, protegida por autenticação JWT.
- Pessoa API: Gerencia pessoas (nome, CPF, telefone, endereço) e associações com animais.
- Serviço API: Registra serviços prestados aos animais, como consultas, vacinas e cirurgias.

## Como rodar o projeto

1. Pré-requisitos:
   - Java 21
   - Maven 
   - MongoDB (localhost:27017)

2.  Passos:
   - Clone o repositório;
 
   - Acesse cada pasta de API individualmente e rode;
   
   - As portas padrão são:
     - Auth API: 8081
     - Animal API: 8082
     - Pessoa API: 8083
     - Serviço API: 8084
       
     - Realizar os teste pelo Swagger ou Postman
