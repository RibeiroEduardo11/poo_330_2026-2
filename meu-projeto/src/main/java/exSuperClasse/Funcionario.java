package exSuperClasse;

public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private boolean risco;
    
    public Funcionario(String matricula, String nome, double salarioBruto, boolean risco){
        this.matricula = matricula;
        this.nome = nome;
        this. salarioBruto = salarioBruto;
        this.risco = risco;
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}

    public boolean getRisco(){ return risco; }
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        if (salarioBruto <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = salarioBruto - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){
        if(risco == true){
            return salarioBruto - getINSS() - getImpRenda() +getSalarioRisco();
        }else return salarioBruto - getINSS() - getImpRenda();

    }

    public double getSalarioRisco(){
        if(risco == true){
            return (salarioBruto +getImpRenda())*0.25;
        }else return 0;
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "(+) INSAL "+ this.getSalarioRisco()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}