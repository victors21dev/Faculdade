public class Ingresso {
    private final int id;
    private final int cod_filme;
    private final String horario;
    private final int sala;
    private final int preco;
    public Ingresso(int id, int cod_filme, String horario, int sala, int preco){
        this.id = id;
        this.cod_filme = cod_filme;
        this.horario = horario;
        this.sala = sala;
        this.preco = preco;
    }
    public int getId(){return id;}
    public int getCod_filme(){return cod_filme;}
    public String getHorario(){return horario;}
    public int getSala(){return sala;}
    public int getPreco(){return preco;}
}