public class Filme {
    private final String nome;
    private final int ano;
    private final String duracao;
    private final int valor;
    private final String sessao;

    Filme(String nome, int ano, String duracao, int valor, String sessao){
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
        this.valor = valor;
        this.sessao = sessao;
    }


    public String getNome() {
        return nome;
    }
    public int getAno() {
        return ano;
    }
    public String getDuracao(){
        return duracao;
    }
    public int getValor() {
        return valor;
    }
    public String getSessao() {
        return sessao;
    }
}