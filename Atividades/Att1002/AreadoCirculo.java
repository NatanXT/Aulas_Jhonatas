package org.Atividades.Att1002;

import java.util.Scanner;

public class AreadoCirculo {
    public static void main(String[] args) {
        double area, n , raio = 0;

        Scanner ScanRaio = new Scanner(System.in);
        System.out.println("Digite o Tamanho do Raio");

        n = 3.14159;
        raio = ScanRaio.nextDouble();

        area = n*(raio*raio);

        System.out.println("A="+ area);
    }
}
