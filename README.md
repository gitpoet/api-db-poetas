# api-db-poetas
Api de gerenciamento de um banco de dados de cordelistas e cantadores
## Diagrama de classes

```mermaid
classDiagram
    class Autor {
        +String nome
        +String bio
    }

    class Cordel {
        +String titulo
        +int numeroPaginas
    }

    Autor --|> Cordel

