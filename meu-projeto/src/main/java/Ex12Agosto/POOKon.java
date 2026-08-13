package Ex12Agosto;
import java.util.*;
public class POOKon {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa do carro");
        String placa = sc.nextLine();

        Carro c1 = new Carro(placa);

        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();

        Cliente cliente = new Cliente(nome);

        System.out.println("Digite o valor da venda");
        double valor = sc.nextDouble();

        Venda v1 = new Venda();
    }
}
