package ExRevPOO;

public class Circulo{
    private int x;
    private int y;
    private int z;
    public Circulo(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Circulo(){
        x = 0;
        y = 0;
        z = 1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }

    public String toString(){
        return "Valor de x: "+x +
                " \nValor de y: "+y+
                " \nValor de z: "+z;
    }


}