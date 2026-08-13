package ex3poo;

public class Matematica {
    private int dividendo;
    private int divisor;
    private int precisao;

    public Matematica(int dividendo, int divisor, int precisao){
        this.divisor = divisor;
        this.dividendo = dividendo;
        this.precisao = precisao;
    }

    public int getDivisor(){
        return divisor;
    }
    public int getDividendo(){
        return dividendo;
    }
    public int getPrecisao(){
        return precisao;
    }
    public void setDivisor(int divisor){
        this.divisor = divisor;
    }
    public void setDividendo(int dividendo){
        this.dividendo = dividendo;
    }
    public void setPrecisao(int precisao){
        this.precisao = precisao;
    }
    public String toString(){
        return "Divisor: "+divisor+
                "\n Dividendo: "+dividendo+
                "\n Precisão: "+precisao;
    }
    public static String operacao(int divisor, int dividendo, int precisao){
        double operacao;
        double aaa = divisor;
        double bbb = dividendo;
        operacao = aaa/bbb;
        operacao = operacao*precisao;


        return "O resultado é: "+operacao;
    }

}
