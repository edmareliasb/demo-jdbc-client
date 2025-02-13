# Demo JDBC Client - Spring Boot 3.x

## Introdução

Este é um projeto de demonstração para testar a nova funcionalidade do JDBC Client introduzida no Spring Boot 3.x.  
O objetivo é fornecer um exemplo prático de como utilizar o `JdbcClient` de forma fluente para operações comuns de consulta e atualização em JDBC, suportando parâmetros posicionais estilo JDBC, bem como parâmetros nomeados no estilo Spring.

## Tecnologias Utilizadas

- **Spring Boot 3.x**
- **H2 Database**

## Pré-requisitos

- Java Development Kit (JDK) 17 ou superior.

## Instalação e Execução

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/edmareliasb/demo-jdbc-client.git
   cd demo-jdbc-client

2. **Construir o projeto:**
   ```bash
   ./mvnw clean package
   
3. **Executar a aplicação:**
   ```bash
    java -jar ./target/demo-jdbc-client-0.0.1-SNAPSHOT.jar

## Configuração
   
A aplicação está configurada para utilizar o banco de dados H2 em memória. As configurações padrão podem ser encontradas no arquivo application.properties. Caso deseje alterar para outro banco de dados, ajuste as propriedades de conexão conforme necessário.

## Uso

Após iniciar a aplicação, você pode interagir com os endpoints RESTful expostos para realizar operações CRUD utilizando o JdbcClient. Os detalhes dos endpoints e exemplos de uso podem ser encontrados na documentação da aplicação ou nos comentários do código-fonte.

## Estrutura do Projeto
O projeto segue a estrutura padrão do Spring Boot:

src/main/java: Contém o código-fonte Java.
src/main/resources: Contém recursos como arquivos de configuração.
pom.xml: Arquivo de configuração do Maven.

