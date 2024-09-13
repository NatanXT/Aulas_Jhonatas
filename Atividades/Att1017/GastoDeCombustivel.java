package org.Atividades.Att1017;

import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        //Atributos
        double litros, quilometros, tempoHoras, distancia;

        //Comunicação com o usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tempo que foi gasto: ");
        tempoHoras = scan.nextDouble();
        System.out.println("Digite os quilômetros gastos: ");
        quilometros = scan.nextDouble();

        //Logica
        distancia = tempoHoras * quilometros;
        litros = distancia / 12.0;

        //Saida
        System.out.printf("%.3f\n", litros);
    }
}
