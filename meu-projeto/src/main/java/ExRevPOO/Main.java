package ExRevPOO;

public class Main{
    public static void main(String[] Args){
        Circulo c1 = new Circulo();


        System.out.println("Testando os getters sem alterar com os setters");
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getZ());

        c1.setX(3);
        c1.setY(3);
        c1.setZ(3);

        System.out.println("Testando os getters após alterar com os setters");
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getZ());

        System.out.println("Testando o toString");
        System.out.println(c1.toString());

        Circulo[] ac = new Circulo[3];

        ac[0] = new Circulo(2,3,4);
        ac[1] = new Circulo(4,6,8);
        ac[2] = new Circulo(8,12,16);

        System.out.println("Printando o vetor de objetos");
        for (int i = 0; i < ac.length; i++) {
            System.out.println(ac[i]);
        }



    }
}