## Classes

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