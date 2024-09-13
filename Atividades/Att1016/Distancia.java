package org.Atividades.Att1016;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        //Atributos
        double velocidadeX, velocidadeY, diferençaVelocidade, tempoHoras, tempoMinutos, distancia;
        velocidadeY = 90;
        velocidadeX = 60;

        //Comunicação com usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os minutos que foram gastos: ");
        distancia = scan.nextDouble();

        //Logica
        diferençaVelocidade = velocidadeY - velocidadeX;
        tempoHoras = distancia/diferençaVelocidade;
        tempoMinutos = tempoHoras * 60;

        //saida
        System.out.println(tempoMinutos + " minutos");

    }
}
