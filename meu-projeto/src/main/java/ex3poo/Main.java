package ex3poo;
import java.util.Scanner;
public class Main {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o divisor");
        int divisor = sc.nextInt();
        System.out.println("Digite o dividendo");
        int dividendo = sc.nextInt();
        System.out.println("Digite a precisão");
        int precisao = sc.nextInt();

        Matematica m1 = new Matematica(dividendo,divisor,precisao);

        System.out.println(m1.operacao(divisor,dividendo,precisao));
    }

}
