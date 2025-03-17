# Adopet Console Application

Este projeto é uma aplicação de console para gerenciamento de abrigos e pets, conectando-se a uma API REST. O sistema possibilita listar abrigos, cadastrar novos abrigos, listar pets e importar pets via CSV para um abrigo específico.

## 📚 Tecnologias e Conceitos Aplicados

### 🔵 **Princípios SOLID**

Durante o desenvolvimento, os princípios SOLID foram aplicados para garantir um código mais organizado, modular e de fácil manutenção:

- **S (Single Responsibility Principle)**: Cada classe foi projetada para ter uma única responsabilidade. Exemplo: `AbrigoService` cuida apenas da lógica relacionada ao abrigo, enquanto `PetService` é responsável pelos pets.
 
- **O (Open/Closed Principle)**: O sistema foi estruturado para ser aberto a extensões, mas fechado para modificações. A implementação do padrão **Command** reforçou este princípio, permitindo adicionar novas operações sem modificar as classes existentes.

- **L (Liskov Substitution Principle)**: A abstração de `Command` garante que qualquer comando possa ser substituído por outra implementação concreta sem afetar a aplicação principal.

- **I (Interface Segregation Principle)**: Ao criar uma interface `Command`, garantimos que cada comando implementa apenas o necessário para executar uma ação específica.

- **D (Dependency Inversion Principle)**: A aplicação passou a depender de abstrações e não de implementações concretas, facilitando testes e mudanças futuras.

---

### 🟢 **Padrão de Projeto - Command**

Foi aplicado o padrão **Command**, cujo objetivo é encapsular requisições como objetos, desacoplando a classe que emite a requisição da classe que a executa.

- **Interface `Command`**: Define o contrato para todos os comandos.
- **Implementações**: `ListarAbrigoCommand`, `CadastrarAbrigoCommand`, `ListarPetsDoAbrigoCommand`, `ImportarPetsDoAbrigoCommand`.
- **`CommandExecutor`**: Classe responsável por executar os comandos de acordo com a escolha do usuário.

### Benefícios obtidos com o padrão Command:
- Redução de código duplicado na classe principal (`AdopetConsoleApplication`).
- Maior legibilidade e organização.
- Facilidade para adicionar novas operações no futuro.

---

### 🟡 **Conventional Commits (Git)**

Foi utilizado o padrão **Conventional Commits** para manter o histórico de commits semântico e compreensível. A seguir, alguns exemplos dos commits realizados:

- `feat(Service e domain): Criando Services e objetos`
- `fix(Codigo duplicado): Removendo codigo duplicado`
- `feat: Testes Unitarios`
- `fix(Command): Utilizando do padrão Command para melhoria do código`

### Vantagens do uso do Conventional Commits:
- Facilita a leitura do histórico de commits.
- Melhora a automatização em CI/CD (geração de changelog, versionamento semântico, etc).
- Define claramente o tipo de alteração feita no projeto (feat, fix, chore, refactor, etc.).

---

## 🚀 Estrutura de Diretórios

main/java/br/com/alura/ 
├── client/ │ └── ClientHttpConfiguration.java 
├── domain/ │ ├── Abrigo.java │ └── Pet.java 
├── service/ │ ├── AbrigoService.java │ └── PetService.java ├── AdopetConsoleApplication.java 
├── CadastrarAbrigoCommand.java 
├── Command.java 
├── CommandExecutor.java 
├── ImportarPetsDoAbrigoCommand.java 
├── ListarAbrigoCommand.java 
└── ListarPetsDoAbrigoCommand.java
test/java/br/com/alura/service/ 
└── AbrigoServiceTest.java

## ✅ Aprendizados adquiridos

- Aplicação prática dos **princípios SOLID** em um projeto real.
- Implementação do **padrão de projeto Command** para desacoplar responsabilidades.
- Organização e padronização do histórico de commits utilizando **Conventional Commits**.
- Estruturação modular e escalável para aplicações em Java com integração HTTP.
- Criação de **testes unitários** para serviços.

---

