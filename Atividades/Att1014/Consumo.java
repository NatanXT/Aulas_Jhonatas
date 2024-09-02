package org.Atividades.Att1014;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        //Atributos
        int quilometros;
        double litros, consumoMedio;

        //Comunicação com o usuario
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe os quilometros dirigidos: ");
            quilometros = scan.nextInt();
            System.out.println("Informe os litros gastos: ");
            litros = scan.nextDouble();
        }

        //logica
        if (quilometros != 0) {
            consumoMedio = quilometros / litros;
        }else {
            consumoMedio = 0;
            System.out.println("Favor coloque um valor acima de zero!");
        }

        //Saida
        System.out.printf("%.3f km/l%n", consumoMedio);

    }
}


