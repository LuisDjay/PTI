package PTI_POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x,y;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor de X: ");
        x = ler.nextInt();
        System.out.println("Insira o valor de Y: ");
        y = ler.nextInt();


        Ponto p1 = new Ponto(x,y);
        Ponto p2 = new Ponto();
        Calculo calculo = new Calculo(x,y);

        int calc = (int) calculo.distancia(x,y);

        System.out.println("Uso do construtor com nenhum parâmetro: ");
        p2.toString();
        System.out.println("Os Pontos X e Y são iguais? " + p2.verificarValores(x, y));
        System.out.println();
        System.out.println("Uso do construtor com 2 parâmetros: ");
        p1.toString();
        System.out.println("Os Pontos X e Y do são iguais? " + p1.verificarValores(x,y));
        System.out.println();
        System.out.println("A distância entre os pontos " + p1.getX() + " e " + p1.getY() + " é: " + calc);
        //System.out.println("A distância entre os pontos " + p1 + " e " + p2 + " é: " + p1.calcDistancia() + - p2.calcDistancia() );
    }






}


