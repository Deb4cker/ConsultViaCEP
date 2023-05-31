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
### Lombok: 
Ferramenta que gera métodos básicos para as classes (getters, setters, toString, equals & hashCode) utilizando notações.
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

- ``@Data``: Cria automaticamente os métodos getter, setter, toString, equals e hashCode para todos os campos da classe;
- ``@NoArgsConstructor``: Cria um construtor vazio padrão, ou seja, um construtor sem argumentos.
- ``@AllArgsConstructor``: Cria um construtor com todos os argumentos, ou seja, um construtor que aceita todos os campos da classe como parâmetros.

O objetivo da utilização do Lombok com essas anotações é reduzir a verbosidade do código, evitando a necessidade de escrever manualmente os métodos getter, setter, toString, equals e hashCode, bem como os construtores vazio e com todos os argumentos. Isso torna a classe mais concisa, mantendo a mesma funcionalidade.

Dependência em XML:
```
<dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
</dependency>
```

### Spring Cache Abstraction (Cacheable)
Abstração de cache do Spring utilizada para melhorar o desempenho da aplicação. Neste contexto, é utilizada para melhorar o tempo de resposta em requisições repetidas.
Foi utilizada na classe "PostalCodeService", camada de serviço responsável pela consulta na API.

```
@Service
@AllArgsConstructor
@EnableCaching
public class PostalCodeService {

    @Cacheable("postalCodes")
    public PostalCode findPostalCode(String cep) {
        {...}  
        return new PostalCode();
    }
}
```

Com a anotação @Cacheable("nome_do_cache"), é possível armazenar o retorno de um método para um argumento específico que já foi mapeado.
O objetivo dessa utilização é atender ao critério diferencial proposto pelo desafio.

Dependência em XML:
```
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-cache</artifactId>
</dependency>
```

## Configurando o ambiente
Certifique-se de ter o JDK 18.0.1.1 instalado em sua máquina. Para construir e executar o projeto, você precisará ter o Maven instalado. Para editar e compilar o projeto, é recomendado utilizar a IDE IntelliJ uma vez que nela todos os recursos vem pre instalados.

## Criação das telas
A IDE NetBeans possui um gerador de código para a biblioteca Java Swing. Neste projeto, as telas foram criadas na IDE e posteriormente incorporadas à classe correspondente dentro do projeto.

A utilização do gerador de código do NetBeans agiliza o processo de criação das telas, permitindo que você projete visualmente a interface do usuário e, em seguida, gere automaticamente o código correspondente.

Para incorporar as telas ao projeto, você pode copiar o código gerado pelo NetBeans e colá-lo na classe correspondente. Isso permite que você mantenha o código e a lógica da interface juntos em um só lugar, facilitando a manutenção e compreensão do projeto.

Essa abordagem combina a facilidade de uso do gerador de código com a flexibilidade e controle oferecidos pela escrita manual do código.

Abaixo a amostra da interface gráfica de criação de telas:

![telaDesign](https://github.com/Deb4cker/MyReadMeAssets/blob/main/Images/netBeans_swing_design.png)

## Executando o projeto
Para executar o projeto siga os seguintes passos:
1. Clone o repositório para sua máquina local.
2. Abra o projeto na IDE (preferencialmente IntelliJ).
3. Certifique-se de que as dependências do projeto tenham sido baixadas corretamente pelo Maven.
4. Na pasta do projeto (``C:\...\ChallengeViaCEP>``), execute o comando ``mvn clean``.
5. A partir daqui voce pode **Criar um executável ``.jar``** ou **rodar na própria IDE** 
6. Uma vez tendo sucesso, caso queira criar o executavel, basta inserir o comando ``mvn install``.
7. Por ultimo, entre na pasta "target", (``C:\...\ChallengeViaCEP\target\>``) onde está o executável e clique duas vezes.

**OBS:** Caso o arquivo não abra, execute no terminal onde está o arquivo .jar o comando: ``java -jar ChallengeViaCEP-0.0.1-SNAPSHOT.jar``.

Se tudo deu certo, então é provável que você esteja diante de uma pequena tela assim:

![LoginView](https://github.com/Deb4cker/MyReadMeAssets/blob/main/Images/login_javaSwing.png)

## Acesso ao banco de dados e registro de usuários

A partir deste ponto você terá 3 opções: 
- **Consultar no banco de dados os usuarios existentes;**
- **Inserir manualmente uma nova entidade no sistema;**
- **Ignorar e inserir nos campos E-email e senha os valores:** ``admin@admin1`` e ``123``. 

### 1. Consultando o banco de dados H2
Por ser uma aplicação pequena e que possui apenas uma entidade, foi utilizado para a persistencia de dados o H2. O banco de dados H2 é um sistema gerenciador de banco de dados em memoria. As configurações dele podem ser acessadas no arquivo ``application.properties``, na pasta resources, dentro da raiz do projeto.
Para acessá-lo, siga os seguintes passos:
1. digite na barra de pesquisa do seu navegador a seguinte url: ``http://localhost:8080/h2-console/``;
2. Você será direcionado para a seguinte tela:

![LoginH2](https://github.com/Deb4cker/MyReadMeAssets/blob/main/Images/h2Console.png) 

3. Certifique-se de que os campos estejam na seguinte disposição:
1. JDBC URL: ``jdbc:h2:mem:UsersViaCEPApp``;
2. Username: ``h2``;
3. Campo senha vazio;
Por fim, clique em ``connect``. Você será direcionado para a seguinte tela: 

![h2Console](https://github.com/Deb4cker/MyReadMeAssets/blob/main/Images/h2Screen.png)

4. Basta agora inserir o comando ``SELECT * FROM USERS`` e clicar em ``Run``.

Pronto, estarão a mostra os usuários cadastrados.


## Agradecimentos

## Licença
