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

                    for(Ingresso Ingresso: sessoes){
                        System.out.println(Ingresso.getId() + ") " + Ingresso.getHorario() + " em sala " + Ingresso.getSala() + ". Ingresso " + Ingresso.getTipo_ingresso() + " no unitário de R$" + Ingresso.getPreco() + ",00."  );
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
//                      Salvar lista ingressos
                        compras.add(new Compra_Impressos(qtd_array,opcao_ingresso, tipo, quantidade_ingresso));
                        qtd_array++;

                        System.out.print("Deseja comprar mais ingressos? 1) Sim. 2) Não: "); opcao3 = sc.nextInt();
                        boolean escolha_if = true;
                        while (escolha_if){
                            if(opcao3 == 1){
                                System.out.println();
                                escolha_if = false;
                            } else if (opcao3 == 2) {
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
}