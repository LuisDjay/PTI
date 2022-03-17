package PTI_POO;

public class Calculo {
    public int x;
    public int y;
    public Calculo(int x, int y) {
        super();
        this.x = x;
        this.y = y;


    }
    public int distancia(int p1, int p2){
        int a = p1.getX() - p2.getX();
        int b = p1.getY() - p2.getY();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return (int) c;



    }

}
