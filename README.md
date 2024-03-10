# Intensivo-java-spring
Intensivo - Dev Superior
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/douglasfragoso/intensivo-java-spring/blob/main/LICENSE) 

# Sobre o projeto
O projeto consiste numa API RESTFul com java e spring boot para fazer requisições HTTP(GET e POST) de jogos de videogame. Nele, você consegue buscar todos os jogos, jogo pelo id, listas dos jogos e lista pelo id. Além disso, através do método POST, é possível fazer a troca de posição de um jogo na lista que ele pertence.

# Tecnologias utilizadas
- Java 21
- Maven
- Spring Boot
- H2 Database
- Postgres
- Postman
- Docker

# Modelo de domínio DSList

![Modelo de domínio DSList](https://github.com/douglasfragoso/intensivo-java-spring/blob/main/dslist-model.png)

# Consulta SQL - verificação método POST
Utilize a consulta a seguir no banco de dados para verificar a mudança de posição do jogo na lista.

```sql
SELECT TB_BELONGING .*, TB_GAME.TITLE FROM TB_BELONGING
INNER JOIN TB_GAME ON TB_GAME.ID = TB_BELONGING.GAME_ID
WHERE LIST_ID = 2
ORDER BY POSITION
```

# Perfis de projeto

## Perfil de desenvolvimento e testes
 - test
 - H2 Database

### Como Utilizar

1. Clone o projeto para sua IDE preferida.
2. Execute o projeto Spring Boot com spring.profiles.active=${APP_PROFILE:test} no aplication.properties.
3. Importe a collection para o Postman através do arquivo `course/CourseApplication.postman_collection.json`.
4. Utilize as rotas fornecidas para realizar requisições ao sistema.
5. Acesse o H2 Database através da porta: http://localhost:8080/h2-console.
6. Execute a consulta SQL fornecida para verificar a troca de posição dos jogos.
   
## Perfil de homologação
 - dev
 - Postgres

### Como Utilizar

1. Clone o projeto para sua IDE preferida.
2. Execute o arquivo docker-compose.yml para criar os containers do Postgres e pgAdmin:
  - Certifique-se que está na pasta do projeto ao abrir o terminal.
  - Adicione o comando para criar os containers: docker-compose up -d
  - Verifique se os containers estão rodando com: docker ps
4. Execute o projeto Spring Boot com spring.profiles.active=${APP_PROFILE:dev} no aplication.properties.
5. Importe a collection para o Postman através do arquivo `course/CourseApplication.postman_collection.json`.
6. Utilize as rotas fornecidas para realizar requisições ao sistema.
7. Acesse o Postgres através da porta: http://localhost:5050.
8. Faça o login:
  - PGADMIN_DEFAULT_EMAIL: me@example.com
  - PGADMIN_DEFAULT_PASSWORD: 1234567
9. Execute a consulta SQL fornecida para verificar a troca de posição dos jogos.

 
