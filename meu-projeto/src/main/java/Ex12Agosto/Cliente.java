package Ex12Agosto;

public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){
        return "Nome do Cliente: "+nome;
    }
}
