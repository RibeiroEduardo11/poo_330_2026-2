package ClassesParaExerVeiculo.ExercicioVeiculos;
import java.util.*;
public class App{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o país da placa do veículo");
        String pais = sc.nextLine();

        System.out.println("Escreva o código da placa do veículo");
        String cod = sc.nextLine();

        Placa p1 = new Placa(pais,cod);

        System.out.println("Escreva a quantidade de combustível do veículo precisa para estar abastecido");
        double combustivel = sc.nextDouble();

        System.out.println("Escreva a distância percorrida");
        double distancia = sc.nextDouble();

        System.out.println("Escreva a quantidade de combustível restante do veículo");
        double combustivelres = sc.nextDouble();

        Veiculo v1 = new Veiculo(p1,combustivel);

        System.out.println("Dados do veículo:");
        System.out.println("Quantidade de combustível: "+v1.getCombustivelNoTanque());
        System.out.println("Distância Efetivamente Percorrida: "+v1.dirige(distancia));
        System.out.println("Quantidade de Combustivel: "+combustivel);
        System.out.println("País da placa: "+pais);
        System.out.println("Código da placa: "+cod);

        //Placa p1 = new Placa("Brasil","ABC1R23");

//        Veiculo v = new Veiculo(p1,combustivel);
//        System.out.println("Dados do veiculo antes de abastecer:");
//        System.out.println(v);
//        System.out.println("----------------");
//
//        v.abastece(65);
//        System.out.println("Dados do veiculo depois de abastecer:");
//        System.out.println(v);
//        System.out.println("----------------");
//
//        v.dirige(250);
//        System.out.println("Dados do veiculo depois de percorrer 250Km:");
//        System.out.println(v);
//        System.out.println("----------------");
        }
}