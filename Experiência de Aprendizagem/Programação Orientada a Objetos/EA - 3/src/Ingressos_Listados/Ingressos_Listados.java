package Ingressos_Listados;

public class Ingressos_Listados {
    private final int preco;
    private final String tipo_ingresso;
    public Ingressos_Listados(String tipo_ingresso, int preco){
        this.tipo_ingresso = tipo_ingresso;
        this.preco = preco;
    }
    public int getPreco_IL(){return preco;}
    public String getTipo_ingresso_IL(){return tipo_ingresso;}
}