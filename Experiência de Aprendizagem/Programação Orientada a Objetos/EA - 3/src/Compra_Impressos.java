public class Compra_Impressos {
    private final int id;
    private final int tipo;
    private final int qtd;
    Compra_Impressos(int id,int tipo, int qtd){
        this.id = id;
        this.tipo = tipo;
        this.qtd = qtd;
    }

    public int getId() {return id;}
    public int getTipo(){return tipo;}
    public int getQtd() {return qtd;}
}
