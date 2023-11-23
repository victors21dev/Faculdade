# Experiência de Aprendizagem - 1

Propor a implementação de um simples projeto em Java de um sistema para compra de ingresso de cinema. O sistema deverá solicitar: o filme de uma lista pré-definida por vocês mesmo; a sessão do filme; e a quantidade de ingressos inteira (R$ 32) e meia (R$16), exibindo o total a pagar.
### Objetivos:
- Usar Estrutura de Decisão e/ou Repetição;
- Usar vetor ou ArrayList;
- Implementar todas funcionalidades;
- Comentar como foi sua experiência com a linguagem.
### Explicando Parte do código
#### Arquivo - Main.java
ArrayList para armazenar palavras
Para adicionar os filmes, criei um arraylist para armazena-lo, com isso, posso criar um new Filme para adicionar vários filmes e mesma lista.
Colocando o nome, ano, duração, valor do ingresso e a sessão.
```java
//      Entrada filmes
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Oppenheimer", 2023,"3h", 45, "Sala 1: 20:00"));
        filmes.add(new Filme("Barbie", 2023,"1h 54m", 90, "Sala 2: 20:00"));
        filmes.add(new Filme("Deadpool", 2016,"1h 48m",30, "Sala 2: 17:00"));
        filmes.add(new Filme("Vingadores: Guerra Infinita", 2018, "2h 29m", 45,"Sala 3: 18:00"));

```
Criação de tabela utilizando o for estrutura de repetição
Aqui é responsável por criar uma tabela, onde aparece a opção de escolha, nome do filme e etc.
Utilizando for para passar por cada elemento da lista e lista-los.
```java
//      Tabela
        System.out.print("--- Bem vindo! ---\n");
        System.out.print("Escolha seu filme pela numeração:\n");
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %40s| %5s| %10s| %10s| %5s", "N", "NOME DO FILME", "ANO","DURAÇÃO", "INTEIRA", "SESSÃO");
        System.out.println();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        for (Filme filme: filmes){
            System.out.format("%5s %40s| %5s| %10s| %10s| %5s", i+1, filme.getNome(), filme.getAno(), filme.getDuracao(), "R$ " + filme.getValor() + ",00", filme.getSessao());
            System.out.println();
            i++;
            total_filmes = i;
        }
        System.out.println(
                "---------------------------------------------------------------------------------------------");

```

IF para Estrutura de decisão
Essa estrutura é responsável pela escolha do usuário, onde ele escolhe o filme e o ingresso (inteira ou meia). De acordo com sua escolha é selecionado o filme, cálculando o ingresso e mostrando as informações do filme e sessão.
```java
//      Escolha
        System.out.print("Qual sua escolha? "); opcao = sc.nextInt();
        if (opcao < 1 || opcao > total_filmes){
            System.out.println("Opção inválida");
        }else {
            System.out.print("1) Inteira. 2) Meia: "); opcao2 = sc.nextInt();
            if (opcao2 == 1){
                System.out.println("Filme " + filmes.get(opcao - 1).getNome() + " do ano " + filmes.get(opcao - 1).getAno() + ", duração de " + filmes.get(opcao - 1).getDuracao() + " pelo valor de R$"+ filmes.get(opcao - 1).getValor() + ".00 (inteira) na " + filmes.get(opcao - 1).getSessao() + " horas");
                System.out.print("Finalizado, obrigado.");
            } else if (opcao2 == 2) {
                System.out.println("Filme " + filmes.get(opcao - 1).getNome() + " do ano " + filmes.get(opcao - 1).getAno() + ", duração de " + filmes.get(opcao - 1).getDuracao() + " pelo valor de R$"+ (filmes.get(opcao - 1).getValor() / 2) + ".00 (meia) na " + filmes.get(opcao - 1).getSessao() + " horas");
                System.out.print("Finalizado, obrigado.");
            }else{
                System.out.print("Opção inválida");
            }
        }
```
#### Aquivo - Filme.java
Orientação a objetos com class
A class Filme orientada a objetos, podendo receber futuras atualizações.
```Java
    Filme(String nome, int ano, String duracao, int valor, String sessao){
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
        this.valor = valor;
        this.sessao = sessao;
    }
```
### Criador

- [@victors21dev](https://www.github.com/victors21dev)
