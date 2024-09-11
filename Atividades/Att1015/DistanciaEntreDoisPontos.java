package org.Atividades.Att1015;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        //Atributos
        double x1, y1, x2, y2, distancia, deltaX, deltaY;

        //Comunicação Usuario
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x1 = scan.nextDouble();
        System.out.println("Digite o valor de Y: ");
        y1 = scan.nextDouble();
        System.out.println("Digite o valor de X2: ");
        x2 = scan.nextDouble();
        System.out.println("Digite o valor de Y2: ");
        y2 = scan.nextDouble();

        //Logica
        deltaX = x2 - x1;
        deltaY = y2 - y1;
        distancia = Math.sqrt(deltaX*deltaX + deltaY*deltaY);

        //Saida
        System.out.printf("%.4f%n", distancia);


    }
}
