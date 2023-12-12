import Ingressos_Listados.Ingressos_Listados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {
    public MenuController(List<Filme> filmes, List<Ingresso> ingressos, int total_filmes) {
        int opcao;
        int opcao2;
        int opcao_ingresso;
        int quantidade_ingresso;
        int tipo;
        int qtd_array = 1;
        boolean repeticao = true;
        boolean adicionando_ingresssos = true;
        Scanner sc = new Scanner(System.in);

        List<Ingresso> sessoes = new ArrayList<>();
        List<Compra_Impressos> compras = new ArrayList<>();
        List<Ingressos_Listados> listagens = new ArrayList<>();

        while(repeticao){
            System.out.print("Digite seu filme de acordo com a ID? "); opcao = sc.nextInt();
            if (opcao < 1 || opcao > total_filmes){
                    System.out.print("Opção inválida! Deseja escolhar novamente? 1) Sim. 2) Não.: "); opcao2 = sc.nextInt();
                    if(opcao2 == 1){
                        System.out.println();
                    }else{
                        System.out.print("Finalizando...");
                        repeticao = false;
                    }
            }else {
//              Compra de ingressos
                System.out.println("O filme foi " + filmes.get(opcao - 1).getNome() + " - " + filmes.get(opcao - 1).getDescricao());
                for(Ingresso ingresso: ingressos){
                    if(ingresso.getCod_filme() == opcao){
                        sessoes.add(ingresso);
                    }
                }

                System.out.println("---------------- Sessões disponíveis ----------------");
                while(adicionando_ingresssos){
                    int opcao3;
                    int escolha_filme = 1;
                    for(Ingresso Ingresso: sessoes){
                        for(Filme filme : filmes){
                            if(filme.getCod() == opcao) {
                                if(filme.getfilme3D()){
                                    salvar_Ingressos(listagens, "VIP", (Ingresso.getPreco() * 2));
                                    salvar_Ingressos(listagens,"Normal", Ingresso.getPreco());
                                    System.out.println(escolha_filme + ") " + Ingresso.getHorario() + " em sala " + Ingresso.getSala() + ". Ingresso VIP" + " no unitário de R$" + (Ingresso.getPreco() * 2) + ",00."  );
                                    escolha_filme++;
                                    System.out.println(escolha_filme + ") " + Ingresso.getHorario() + " em sala " + Ingresso.getSala() + ". Ingresso Normal" + " no unitário de R$" + Ingresso.getPreco() + ",00."  );
                                    escolha_filme++;
                                }else{
                                    salvar_Ingressos(listagens, "Normal", Ingresso.getPreco());
                                    System.out.println(escolha_filme + ") " + Ingresso.getHorario() + " em sala " + Ingresso.getSala() + ". Ingresso Normal" + " no unitário de R$" + Ingresso.getPreco() + ",00."  );
                                    escolha_filme++;
                                }
                            }
                        }
                    }
                    System.out.print("Digite o ingresso que deseja: "); opcao_ingresso = sc.nextInt();
                    System.out.print("1) Inteira. 2) Meia: "); tipo = sc.nextInt();
                    System.out.print("Digite a quantidade: "); quantidade_ingresso = sc.nextInt();

                    if(opcao_ingresso < 1 || opcao_ingresso>(sessoes.size())){
                        System.out.println("Opção invalída em Ingresso.");
                        adicionando_ingresssos = false;
                    }else if (tipo < 1 || tipo > 2){
                        System.out.println("Opção invalída em Tipo do ingresso.");
                        adicionando_ingresssos = false;
                    } else if (quantidade_ingresso < 1) {
                        System.out.println("Opção invalída em quantidade de ingressos.");
                        adicionando_ingresssos = false;
                    }else{
                        qtd_array++;
                        compras.add(new Compra_Impressos(opcao_ingresso, tipo, quantidade_ingresso));
                        System.out.print("Deseja comprar mais ingressos? 1) Sim. 2) Não: "); opcao3 = sc.nextInt();
                        boolean escolha_if = true;
                        while (escolha_if){
                            if(opcao3 == 1){
                                System.out.println();
                                escolha_if = false;
                            } else if (opcao3 == 2) {
                                imprimir_nota(filmes, sessoes, compras, opcao, listagens);
                                escolha_if = false;
                                adicionando_ingresssos = false;
                                repeticao = false;
                            }else{
                                System.out.println("Opção inválida, tente novamente.");
                            }
                        }
                    }
                }
            }
        }
    }
//  Salvamento na lista compras
    private void salvar_Ingressos(List<Ingressos_Listados> listagens, String tipo_ingresso, int preco){
        listagens.add(new Ingressos_Listados(tipo_ingresso, preco));
    }
//  Mostrar na tela a nota
    private void imprimir_nota(List<Filme> filmes, List<Ingresso> sessoes, List<Compra_Impressos> compras, int opcao, List<Ingressos_Listados> listagens){
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
        boolean vip = false;
        for(Compra_Impressos Compra: compras){
            int preco_ingresso;
            String tipo_in;
            if(Compra.getTipo() == 2){
                preco_ingresso = listagens.get(opcao - 1).getPreco_IL() / 2;
                total_pagar = (total_pagar + ((preco_ingresso / 2) * Compra.getQtd()));
                tipo_in = "Meia";
            }else{
                preco_ingresso = listagens.get(opcao - 1).getPreco_IL();
                total_pagar = (total_pagar + (preco_ingresso * Compra.getQtd()));
                tipo_in = "Inteira";
            }
            System.out.println(qtd + " - R$" + preco_ingresso + ",00. Quantidade: " + Compra.getQtd() + " " + tipo_in + " " + listagens.get(opcao - 1).getTipo_ingresso_IL());
            if(listagens.get(opcao - 1).getTipo_ingresso_IL() == "VIP"){
                vip = true;
            }
            qtd++;
        }
        System.out.println();
        System.out.println("____Total____");
        System.out.println("Total a pagar R$ - " + total_pagar + ",00.");
        if(vip){
            System.out.println("____Observação____");
            System.out.println("Lanchonete do cinema liberada!");
        }

    }
}