package Ex12Agosto;

public class Carro {
    private String placa;

    public Carro(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String toString(){
        return "Placa do Carro: "+placa;
    }
}
