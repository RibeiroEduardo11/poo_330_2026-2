
/**
 * Escreva uma descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    private String nomeDisciplina;
    private int numTurma;
    private Aluno[] vetor;
    private int proximoIndice;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma(String nomeDisciplina, int numTurma, int tamanho)
    {
        // inicializa variáveis de instância
        this.nomeDisciplina = nomeDisciplina;
        this.numTurma = numTurma;
        vetor  = new Aluno[tamanho];
        proximoIndice = 0;
    }
    
    public boolean addAluno(Aluno a){
        vetor[proximoIndice]=a;
        proximoIndice++;
        return true;
    }
    
    public String toString(){
        String saida = "Nome: "+nomeDisciplina+ " Turma: "+ numTurma;
        for (int t=0; t<proximoIndice;t++){
            saida = saida + "\n"+ vetor[t].toString();
        }
        return saida;
        
    }
}