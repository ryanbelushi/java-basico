## Classes

Uma classe em Java é um modelo que define atributos (variáveis) e métodos (funções).

Ela serve como base para criar objetos.

Um objeto é uma **instância** da classe.

Instância significa que algo foi "criado a partir do molde" (classe).

  Exemplo: se a classe for "Carro", criar um objeto é como fabricar um carro real com base no projeto.
  
Cada instância pode ter valores diferentes, mas segue a mesma estrutura da classe.

Classes deverão começar com as primeiras letras em maiúsculo.

Exemplo:

```
public classs MinhaClasse {

}
```
Grande parte das clases começam com o prefixo "public class".

Se a classe for uma classe executável, ou seja, uma classe que irá inicializar algo do proejeto. Essa classe deverá ter um método principal que é o main.

```
public class MinhaClasse {
    public static void main(String [] args) {

    }
}
```
## Padrão de nomenclatura

Todo arquivo .java deve começar com a letra maiuscula, caso seja uma palavra composta, ambas palavras deverão ter a letra maiuscula.

A classe deverá ter o mesmo nome do arquivo.

As variáveis deverão seguir o padrão camelCase.

Quando queremos declarar uma variável que não terá o valor alterado ela deverá seguir o padrão abaixo:

```
final String BR = "Brasil";
double PI = 3.14;
int IDADE_ALUNO = 20;
```

A palavra reservada final transforma a variável em uma constante.

## Declarando variáveis e métodos:

Declarar uma variável em java segue sempre a seguinte estrutura:

Tipo nomeBemDefinido = atribuição (opcional em alguns casos).

Exemplo:

int idade = 23;
double altura = 1.62;
Dog spike; (neste exemplo dog é uma classe que representa um cachorro e essa variavel ainda não recebera um valor).

Declarando metodos em java segue uma estrutura bem simples:

TipoRetorno NomeObjetivoNoInfinitivo parametro(s)

Exemplo:

```
int somar (int numeroUm, int numeroDois){

}
```
Um método pode ter um parametro diferente de um tipo.

```
public static String nomeCompleto (String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
     }
```

Nota:

O modificador 'static' significa que o método pertence à classe, e não a um objeto dela.

Métodos 'static' podem ser chamados sem criar um objeto da classe.

O método 'main' precisa ser static, pois é o ponto de entrada da aplicação.

Um método static só pode acessar diretamente outros métodos ou variáveis static.