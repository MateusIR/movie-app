
-----

# MovieApp

-----

## 📚 Sobre o Projeto

O **MovieApp** é uma aplicação Java Spring Boot desenvolvida para permitir a busca, armazenamento e consulta de informações sobre séries. Ele consome dados de uma API externa (OMDB API) e oferece funcionalidades tanto para interação via console quanto através de uma API RESTful.

O projeto foi estruturado para demonstrar o uso de:

  * **Spring Boot**: Para o desenvolvimento rápido de aplicações robustas.
  * **Spring Data JPA**: Para persistência de dados em um banco de dados relacional.
  * **OMDB API**: Para obter informações detalhadas sobre séries e episódios.
  * **RESTful API**: Para expor endpoints que permitem a interação com a aplicação.

-----

## 🌟 Funcionalidades

O MovieApp oferece as seguintes funcionalidades principais:

### 🖥️ Funcionalidades do Console (`Main`)

  * **Buscar Séries**: Permite ao usuário buscar séries por título na OMDB API e salvar os dados no banco de dados local.
  * **Buscar Episódios por Série**: Após buscar e salvar uma série, é possível buscar e persistir os episódios de todas as suas temporadas.
  * **Listar Séries Buscadas**: Exibe todas as séries que foram buscadas e salvas no banco de dados.
  * **Buscar Série por Título (no DB)**: Permite verificar se uma série específica já está salva no banco de dados.

### 🌐 Funcionalidades da API RESTful (`SerieController`)

A API RESTful expõe diversos endpoints para interagir com as séries e episódios armazenados:

  * **`GET /series`**: Retorna uma lista de todas as séries salvas.
  * **`GET /series/top5`**: Retorna as 5 séries com a melhor avaliação (IMDB Rating).
  * **`GET /series/lancamentos`**: Retorna as 5 séries mais recentes com base na data de lançamento dos seus episódios.
  * **`GET /series/{id}`**: Retorna os detalhes de uma série específica pelo seu ID.
  * **`GET /series/{id}/temporadas/todas`**: Retorna todos os episódios de todas as temporadas de uma série específica.
  * **`GET /series/{id}/temporadas/{numero}`**: Retorna os episódios de uma temporada específica de uma série.

-----

## 🛠️ Tecnologias Utilizadas

  * **Java 17+**: Linguagem de programação.
  * **Spring Boot**: Framework para construção de aplicações Java.
      * **Spring Web**: Para o desenvolvimento de APIs RESTful.
      * **Spring Data JPA**: Para abstração e persistência de dados.
  * **Hibernate**: Implementação ORM padrão do JPA.
  * **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.
  * **Jackson**: Biblioteca para serialização e desserialização de JSON.
  * **OMDB API**: API externa para buscar informações sobre filmes e séries.

-----

## ⚙️ Como Rodar o Projeto

### Pré-requisitos

  * JDK 17 ou superior instalado.
  * Maven instalado.
  * Um banco de dados PostgreSQL configurado.
  * Uma chave de API da OMDB API (substitua `SUA_API_KEY` na classe `Main` pela sua chave).

### Configuração do Banco de Dados

1.  Crie um banco de dados PostgreSQL para o projeto.

2.  Configure as credenciais do banco de dados no arquivo `application.properties` (ou `application.yml`) do Spring Boot. Exemplo:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

### Rodando a Aplicação

1.  Clone o repositório para sua máquina local.
2.  Navegue até o diretório raiz do projeto no terminal.
3.  Compile o projeto usando Maven:
    ```bash
    mvn clean install
    ```
4.  Execute a aplicação Spring Boot:
    ```bash
    mvn spring-boot:run
    ```

A aplicação será iniciada e a API REST estará disponível, além do menu interativo no console.

-----
