package org.Atividades.Att1002;

import java.util.Scanner;

public class AreadoCirculo {
    public static void main(String[] args) {
        double area, n , raio;

        Scanner ScanRaio = new Scanner(System.in);
        System.out.println("Digite o Tamanho do Raio");

        n = 3.14159;
        raio = ScanRaio.nextDouble();

        area = n*(raio*raio);

        //Criando uma forma de formatar as casas decimais
        String formattedArea = String.format("%.4f",area);
        System.out.println("A="+ formattedArea);
        //Duas maneiras diferentes
        System.out.printf("A=%.4f%n",area);

    }
}
