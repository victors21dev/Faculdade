public class Compra_Impressos {
    private final int id;
    private final int opcao;
    private final int tipo;
    private final int qtd;
    Compra_Impressos(int id, int opcao,int tipo, int qtd){
        this.id = id;
        this.opcao = opcao;
        this.tipo = tipo;
        this.qtd = qtd;
    }

    public int getId() {return id;}
    public int getOpcao() {return opcao;}
    public int getTipo(){return tipo;}
    public int getQtd() {return qtd;}
}
