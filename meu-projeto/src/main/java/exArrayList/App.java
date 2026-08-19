package exArrayList;
import java.util.Scanner;
import java.util.*;
/**
 * Este programa é composto:
 * uma classe Aluno, considerando que todo aluno possui matrícula, nome e e-mail.
 * Esta classe possui os métodos básicos também.
 * A classe turma - lista - possui as seguintes operações: construtor
 * (instancia a turma – nome da disciplina, número da turma e tamanho da turma - vetor),
 * adiciona aluno (insere um aluno na turma e não permite que dois alunos tenham a
 * A classe Principal recebe nome da disciplina, número da turma e tamanho da turma. Além disso, cadastre 2 alunos
 * “manual” e os insere no vetor.
 * A partir disso faça: inicialmente um teste a fim de verificar se todas as classes estão corretas
 * Verifique se é possível tranasformar em arrayList e, caso possível, faça as alterar e os testes.
 **/
public class App
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nomeDisciplina;
        int tamanho, numeroTurma;

        System.out.println("Digite o nome da disciplina: ");
        nomeDisciplina = in.nextLine();
        System.out.println("Digite o número da turma: ");
        numeroTurma = in.nextInt();
        System.out.println("Digite o tamanho da turma: ");
        tamanho = in.nextInt();

        Turma t = new Turma(nomeDisciplina, numeroTurma, tamanho);


        Aluno a1 = new Aluno(1234, "Ana", "ana@gmail.com");
        Aluno a2 = new Aluno(5678, "Andre", "andre@gmail.com");


        if(t.addAluno(a1)==true)
            System.out.println("aluno adicionado");
        else
            System.out.println("aluno não adicionado");

        if(t.addAluno(a2)==true)
            System.out.println("aluno adicionado");
        else
            System.out.println("aluno não adicionado");

        System.out.println(t.toString());
    }
}
