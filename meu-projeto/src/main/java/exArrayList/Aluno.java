package exArrayList;
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    // variáveis de instância 
    private int matricula;
    private String nome;
    private String email;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int mat, String nome, String email)
    {
        // inicializa variáveis de instância
        matricula = mat;
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome(){ return nome;
    }
    public String getEmail(){ return email;
    }
    public int getMatricula(){ return matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String toString(){
        return "Nome: "+ nome + " Matricula: " + matricula + " Email:" + email;
    }
}
