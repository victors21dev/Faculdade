import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Variáveis
        int i = 0;
        int total_filmes = 0;
        int contador = 0;
        int total_ingressos = 0;
        Scanner sc = new Scanner(System.in);

//      Entrada filmes
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme(1, "Oppenheimer", "Christopher Nolan", "O físico J. Robert Oppenheimer trabalha com uma equipe de cientistas durante o Projeto Manhattan, levando ao desenvolvimento da bomba atômica.", "Thriller/Suspense", 2023, "3h", true));
        filmes.add(new Filme(2, "Barbie", "Greta Gerwig", "Depois de ser expulsa da Barbieland por ser uma boneca de aparência menos do que perfeita, Barbie parte para o mundo humano em busca da verdadeira felicidade.", "Comédia/Fantasia", 2023, "1h 54m", true));
        filmes.add(new Filme(3, "Deadpool", "Tim Miller", "Wade Wilson é um ex-agente especial que passou a trabalhar como mercenário. Seu mundo é destruído quando um cientista maligno o tortura e o desfigura completamente. O experimento brutal transforma Wade em Deadpool, que ganha poderes especiais de cura e uma força aprimorada. Com a ajuda de aliados poderosos e um senso de humor mais desbocado e cínico do que nunca, o irreverente anti-herói usa habilidades e métodos violentos para se vingar do homem que quase acabou com a sua vida.", "Ação/Comédia", 2016, "1h 48m", false));
        filmes.add(new Filme(4, "Vingadores: Guerra Infinita", "Joe e Anthony Russo", "Homem de Ferro, Capitão América, Thor, Hulk e os Vingadores se unem para combater o maligno Thanos. Em uma missão para coletar todas as seis pedras infinitas, Thanos planeja usá-las para infligir sua vontade maléfica sobre a humanidade.", "Ação/Ficção científica", 2018, "2h 29m", false));

//      Entrada ingressos
        List<Ingresso> ingressos = new ArrayList<>();
        ingressos.add(new Ingresso(1,1,"20:00", 1, 40));
        ingressos.add(new Ingresso(2,1,"12:00", 1, 46));
        ingressos.add(new Ingresso(3,2,"16:00", 2, 24));
        ingressos.add(new Ingresso(4,3,"20:00", 3, 32));
        ingressos.add(new Ingresso(5,3,"16:00", 4, 36));
        ingressos.add(new Ingresso(6,4,"20:00", 4, 54));

//      Contador total de ingressos
        for(Ingresso ingresso : ingressos){
            total_ingressos++;
        }

//      Tabela
        System.out.print("--- Bem vindo! ---\n");
        System.out.print("Escolha seu filme pela numeração:\n");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%5s %40s| %25s| %25s| %10s| %5s", "ID", "NOME DO FILME", "DIRETOR", "GÊNERO", "ANO", "DURAÇÃO");
        System.out.println();
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------");
        for (Filme filme : filmes) {
            System.out.format("%5s %40s| %25s| %25s| %10s| %5s", filme.getCod(), filme.getNome(), filme.getDiretor(), filme.getGenero(), filme.getAno(), filme.getDuracao());
            System.out.println();
            i++;
            total_filmes = i;
        }
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------");

//      Controlador
        new MenuController(filmes, ingressos, total_filmes);
    }
}