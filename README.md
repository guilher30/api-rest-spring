# library
integrantes: 
Guilherme Moura de Souza
Charles Aparecido da Silva Moreira
Projeto foi realizado utilizando o Framework Spring Boot.

End points: 
Buscar todos:
GET http://localhost:8080/livros

Buscar por Id: 
GET http://localhost:8080/livros/4

Adicionar Livro:
POST http://localhost:8080/livros

Exemplo de Body pra POST:
{
    "nome": "O Conta da Aia",
    "autor": "Margaret Atwood",
    "ano": 1985,
    "genero": {
        "id": 1
    }
}

Deleta Livro por ID: 
DELETE http://localhost:8080/livros/7


        
