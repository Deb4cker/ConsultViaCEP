# ConsultViaCEP 🏙️
Resolução pessoal do desafio proposto: Criar um programa Java que retorna valores de uma consulta na API ViaCEP.

# Sobre o projeto
### O Desafio proposto 🏁
Desenvolver um programa em Java que abre uma tela com um campo para informar um
CEP. Quando clicar no botão pesquisar, o CEP deve ser pesquisado em
https://viacep.com.br/ e o retorno deve vir na resposta da requisição e ser impresso na tela.
Este programa deve possuir uma tela de autenticação, ou seja, antes de pesquisar o CEP é
preciso informar login e senha.

## Tecnologias utilizadas
Para criar o projeto, foram utilizadas as seguintes tecnologias:

- ☕**Java 17**: Linguagem de programação utilizada no desenvolvimento do projeto.
- 🔴**Maven**: Ferramenta de gerenciamento de dependências e construção do projeto.
- 🍃**Spring Boot**: Framework que facilita o desenvolvimento de aplicativos Java baseados em Spring.
- 🌐**JPA** (Java Persistence API): Especificação do Java para mapeamento objeto-relacional.
- ⤵️**H2 Database**: Banco de dados em memória utilizado para armazenar os dados do aplicativo.
- 🧰**JDK 18.0.1.1**: Java Development Kit na versão 18.0.1.1 utilizado para compilar e executar o projeto.
- 📱**Java Swing**: Biblioteca gráfica utilizada para criação das telas do aplicativo.
- 💻**IntelliJ**: IDE de desenvolvimento Java utilizada para editar e compilar o projeto.
- 🖌️**NetBeans**: IDE de desenvolvimento Java utilizada para editar e compilar o projeto, neste contexto, utilizada para a criação das telas via Java Swing.

## Dependências utilizadas
Lombok: Ferramenta que gera métodos básicos para as classes (getters, setters, toString, equals & hashCode) utilizando notações.
Exemplo de uso de notações do Lombok na classe "User":

```
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
}
```

As anotações ``@Data``, ``@NoArgsConstructor`` e ``@AllArgsConstructor`` têm os seguintes propósitos:

``@Data``: Cria automaticamente os métodos getter, setter, toString, equals e hashCode para todos os campos da classe.
``@NoArgsConstructor``: Cria um construtor vazio padrão, ou seja, um construtor sem argumentos.
``@AllArgsConstructor``: Cria um construtor com todos os argumentos, ou seja, um construtor que aceita todos os campos da classe como parâmetros.

O objetivo da utilização do Lombok com essas anotações é reduzir a verbosidade do código, evitando a necessidade de escrever manualmente os métodos getter, setter, toString, equals e hashCode, bem como os construtores vazio e com todos os argumentos. Isso torna a classe mais concisa, mantendo a mesma funcionalidade.

Spring Cache Abstraction: [Versão da dependência](link da documentação)

## Configurando o ambiente
Certifique-se de ter o JDK 18.0.1.1 instalado em sua máquina. Para construir e executar o projeto, você precisará ter o Maven instalado. Para editar e compilar o projeto, é recomendado utilizar a IDE IntelliJ.

## Executando o projeto

## Agradecimentos

## Licença
