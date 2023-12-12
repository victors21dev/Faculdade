public class Filme {
    private final int cod;
    private final String nome;
    private final String diretor;
    private final String descricao;
    private final String genero;
    private final int ano;
    private final String duracao;
    private final Boolean filme3D;

    public Filme(int cod, String nome, String diretor, String descricao, String genero, int ano, String duracao, boolean filme3D){
        this.cod = cod;
        this.nome = nome;
        this.diretor = diretor;
        this.descricao = descricao;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.filme3D = filme3D;
    }

    public int getCod(){return cod;}
    public String getNome() {return nome;}
    public String getDiretor(){return diretor;}
    public String getDescricao(){return descricao;}
    public String getGenero(){return genero;}
    public int getAno() {return ano;}
    public String getDuracao(){return duracao;}
    public Boolean getfilme3D(){return filme3D;}
}