package exArrayList;

import javax.lang.model.element.ElementKind;
import java.util.ArrayList;

/**
 * Solução própria do exercício 1, a unica classe alterada foi a Turma
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    private String nomeDisciplina;
    private int numTurma;
    private ArrayList<Aluno> listaAlunos;
    private int proximoIndice;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma(String nomeDisciplina, int numTurma, int tamanho)
    {
        // inicializa variáveis de instância
        this.nomeDisciplina = nomeDisciplina;
        this.numTurma = numTurma;
        listaAlunos = new ArrayList<Aluno>();
        proximoIndice = 0;
    }
    
    public boolean addAluno(Aluno a){
        listaAlunos.add(proximoIndice,a);
        proximoIndice++;
        return true;
    }
    
    public String toString(){
        String saida = "Nome: "+nomeDisciplina+ " Turma: "+ numTurma;
        for (int t=0; t<proximoIndice;t++){
            saida = saida + "\n"+ listaAlunos.get(t).toString();
        }
        return saida;
        
    }
}