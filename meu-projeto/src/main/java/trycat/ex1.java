package trycat;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int idade = -1;
        System.out.println("Insira seu nome");
        String nome = sc.nextLine();
        System.out.println("Insira seu sexo");
        String sexo = sc.nextLine();
        while (idade < 0) {
            try {
                System.out.println("Insira sua idade");
                idade = sc.nextInt();
                if (idade < 0) {
                    throw new ex1b("Erro - idade negativa");
                }
            } catch (ex1b e) {
                System.out.println("Erro - idade negativa");
            }
        }


        System.out.println("Insira sua matricula");
        int matricula = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o ano de ingresso");
        String ingresso = sc.nextLine();

    }
}
