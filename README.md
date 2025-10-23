# 🧠 Workshop Spring Boot 3 + MongoDB

Projeto desenvolvido como parte de um **workshop prático de integração entre Spring Boot 3 e MongoDB**, com o objetivo de aplicar conceitos modernos de **APIs RESTful**, **banco de dados NoSQL**, **injeção de dependências** e **boas práticas de arquitetura em Java**.

---

## 🚀 Visão Geral

O sistema implementa uma **API REST** para gerenciamento de **usuários e posts**, simulando uma rede social simplificada.  
A aplicação foi desenvolvida com **Spring Boot 3**, utilizando o **MongoDB** como banco de dados não relacional para armazenar documentos JSON de forma ágil e escalável.

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 21**
- 🧩 **Spring Boot 3**
- 📦 **Spring Data MongoDB**
- 🔧 **Maven**
- 🧰 **Lombok**
- 🌐 **Spring Web**
- 🧠 **DTOs (Data Transfer Objects)**
- 🧪 **Postman / Insomnia (para testes de API)**

---

## 🧩 Estrutura do Projeto

``bash
workshop-springboot3-mongoDB/
├── src/
│   ├── main/
│   │   ├── java/com/eder/workshop/
│   │   │   ├── domain/        # Classes de domínio (User, Post, Comment)
│   │   │   ├── repository/    # Interfaces de acesso ao MongoDB
│   │   │   ├── service/       # Regras de negócio e validações
│   │   │   ├── resource/      # Controladores REST (UserResource, PostResource)
│   │   │   └── dto/           # Classes DTO para transferência de dados
│   │   └── resources/
│   │       ├── application.properties  # Configurações da aplicação
│   │       └── import.sql (se houver)
│   └── test/                  # Testes automatizados
├── pom.xml                    # Configurações do Maven
└── README.md
📚 Endpoints Principais
👤 Usuários
Método	Endpoint	Descrição
GET	/users	Lista todos os usuários
GET	/users/{id}	Retorna um usuário por ID
POST	/users	Cadastra um novo usuário
PUT	/users/{id}	Atualiza os dados de um usuário
DELETE	/users/{id}	Remove um usuário

📝 Posts
Método	Endpoint	Descrição
GET	/posts	Lista todos os posts
GET	/posts/{id}	Retorna um post por ID
GET	/posts/titlesearch?text=...	Busca posts por título
GET	/posts/fullsearch?text=...&minDate=...&maxDate=...	Busca avançada por título e intervalo de datas

🧠 Conceitos e Habilidades Aplicadas
Injeção de Dependências (IoC / DI)
Uso do Spring para gerenciar componentes e serviços de forma automática.

Arquitetura em Camadas (Domain → Repository → Service → Resource)
Favorece coesão, isolamento de responsabilidades e manutenção.

DTOs (Data Transfer Objects)
Aplicação de boas práticas para transportar dados entre as camadas da aplicação.

Integração com MongoDB
Persistência de dados não estruturados usando Spring Data MongoDB.

Consultas Personalizadas
Implementação de query methods e anotações como @Query.

Boas Práticas de Clean Code e Restful APIs
Nomeação clara de endpoints, retorno semântico e padronização de respostas HTTP.

🧪 Executando o Projeto
🔧 Pré-requisitos
Java 21+

Maven 3.9+

MongoDB instalado localmente ou via Docker.

▶️ Execução Local
bash
Copiar código
# Clonar o repositório
git clone https://github.com/EderSantos10/workshop-springboot3-mongoDB.git

# Acessar o diretório
cd workshop-springboot3-mongoDB

# Compilar e executar
mvn spring-boot:run
A aplicação estará disponível em:
📍 http://localhost:8080

🐳 Execução com Docker (opcional)
bash
Copiar código
# Subir o MongoDB
docker run -d -p 27017:27017 --name mongo-db mongo:latest

# Verificar se o container está ativo
docker ps
🧾 Exemplo de Documento no MongoDB
json
Copiar código
{
  "_id": "67890abc123",
  "name": "Eder Santos",
  "email": "eder.santos@example.com",
  "posts": [
    {
      "id": "001",
      "title": "Integrando Spring Boot com MongoDB",
      "date": "2025-10-22T18:30:00",
      "comments": [
        {
          "text": "Excelente conteúdo!",
          "author": "Maria"
        }
      ]
    }
  ]
}
👨‍💻 Autor
Eder Santos
Desenvolvedor Java | Especialista em Microsserviços, Spring Boot e Banco de Dados
📧 Contato: github.com/EderSantos10

🏁 Licença
Este projeto é de uso educacional e segue os princípios de aprendizado aberto.
Sinta-se livre para estudar, melhorar e compartilhar!

