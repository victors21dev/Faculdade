import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Variáveis
        int i = 0;
        int total_filmes = 0;
        int opcao;
        int opcao2;
        Scanner sc = new Scanner(System.in);

//      Entrada filmes
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Oppenheimer", 2023,"3h", 45, "Sala 1: 20:00"));
        filmes.add(new Filme("Barbie", 2023,"1h 54m", 90, "Sala 2: 20:00"));
        filmes.add(new Filme("Deadpool", 2016,"1h 48m",30, "Sala 2: 17:00"));
        filmes.add(new Filme("Vingadores: Guerra Infinita", 2018, "2h 29m", 45,"Sala 3: 18:00"));

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
    }
}
// instagram: santosvictor18