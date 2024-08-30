package org.Atividades.Att1011;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        //Atributos
        int raio;
        double pi = 3.14159, volume;

        //Comunicacao com o usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = scan.nextInt();

        //Logica
//      volume = ((4.0/3) * pi * ((raio * raio) * raio));
        volume = ((4.0/3) * pi * (Math.pow(raio, 3)));

        //Saida
        System.out.printf("VOLUME = %.3f%n" , volume);
    }
}
