
# Experiência de Aprendizagem - 2

Após nos familiarizarmos com a linguagem Java, agora é a vez que colocarmos em prática os conhecimentos do paradigma de Programação Orientada a Objeto.
Para tal, vamos evoluir o nosso projeto anterior de forma a aplicar os conceitos de Classe, Objeto e Encapsulamento.  Como nosso projeto anterior era um sistema de compra de ingresso de cinema, leve em consideração os seguintes:
### Objetivos:
- Crie uma classe MenuController, que deverá ter os métodos que controlam a interação do usuário com o sistema. Cada ação como selecionar filme, comprar ingresso, exibir o resultado final deve ser uma função separada;
- Crie uma classe Filme com o nome, diretor, descrição, gênero e duração do filme;
- Crie uma classe Ingresso contendo o filme, tipo de ingresso e o horário da seção;
- Integre todo o sistema com o uso das classes criadas usando corretamente o encapsulamento.
### Explicando Parte do código
#### Adicionado novas classes!
Foi adicionado novas classes para melhor organização na orientação a objetos no projeto.
Utilizando conceito de Encapsulamento
- Compra_Impressos.java
- Ingresso.java
- MenuController.java

Class Filme recebeu modificação, recebendo atualizações:
```java
 public Filme(int cod, String nome, String diretor, String descricao, String genero, int ano, String duracao){
        this.cod = cod;
        this.nome = nome;
        this.diretor = diretor;
        this.descricao = descricao;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
    }
```
Class Ingresso
```java
    public Ingresso(int id, int cod_filme, String tipo_ingresso, String horario, int sala, int preco){
        this.id = id;
        this.cod_filme = cod_filme;
        this.tipo_ingresso = tipo_ingresso;
        this.horario = horario;
        this.sala = sala;
        this.preco = preco;
    }
```
Class Compra_Impressos
```java
    Compra_Impressos(int id, int opcao,int tipo, int qtd){
        this.id = id;
        this.opcao = opcao;
        this.tipo = tipo;
        this.qtd = qtd;
    }
```

Para chamar o MenuController, o Main recebe um new MenuController
```java
//      Controlador
        new MenuController(filmes, ingressos, total_filmes);
```
Lá é feito toda a parte de interação com o usuário, mostrando os filmes e salvando as escolhas, para no final gerar uma nota.

Abaixo contendo:

Salvar ingressos escolhidos
```java
    private void salvar_Ingressos(List<Compra_Impressos> compras, int qtd_array,int opcao_ingresso, int tipo, int quantidade_ingresso){
        compras.add(new Compra_Impressos(qtd_array,opcao_ingresso, tipo, quantidade_ingresso));
    }
```
Imprimir nota
```java
    private void imprimir_nota(List<Filme> filmes, List<Ingresso> sessoes, List<Compra_Impressos> compras, int opcao){
        System.out.println("Legal! Aqui a sua notinha abaixo:");
        System.out.println();
        System.out.println("---------------- Nota - CinemaMax ----------------");
        System.out.println();
        System.out.println("____Sobre o filme____");
        System.out.print("Filme " + filmes.get(opcao - 1).getNome() + " de " + filmes.get(opcao - 1).getAno() + ". Com " + filmes.get(opcao - 1).getDuracao() + " de duração.");
        System.out.println(filmes.get(opcao - 1).getDescricao());
        System.out.println("Diretor: " + filmes.get(opcao - 1).getDiretor() + ". Gênero: " + filmes.get(opcao - 1).getGenero());
        System.out.println();
        System.out.println("____Ingressos____");
        int qtd = 1;
        int total_pagar = 0;
        for(Compra_Impressos Compra: compras){
            int preco_ingresso;
            String tipo_in;
            if(Compra.getTipo() == 2){
                preco_ingresso = (sessoes.get(Compra.getOpcao()-1).getPreco() / 2);
                total_pagar = (total_pagar + sessoes.get(Compra.getOpcao()-1).getPreco() / 2);
                tipo_in = "Meia";
            }else{
                preco_ingresso = sessoes.get(Compra.getOpcao()-1).getPreco();
                tipo_in = "Inteira";
                total_pagar = (total_pagar + sessoes.get(Compra.getOpcao()-1).getPreco());
            }
            System.out.println(qtd + " - R$" + preco_ingresso + ",00. Quantidade: " + Compra.getQtd() + " ingressso: " + tipo_in);

            qtd++;
        }
        System.out.println();
        System.out.println("____Total____");
        System.out.print("Total a pagar R$ - " + total_pagar + ",00.");
    }
```

São chamados com:
```java
    //  Salvar lista ingressos
    salvar_Ingressos(compras, qtd_array, opcao_ingresso, tipo, quantidade_ingresso);
```
e
```java
    imprimir_nota(filmes, sessoes, compras, opcao);
```

### Criador

- [@victors21dev](https://www.github.com/victors21dev)
