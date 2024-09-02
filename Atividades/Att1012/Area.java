package org.Atividades.Att1012;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //Atributos
        double A, B, C, pi = 3.14159;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        //Comunicacao com usuario
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Digite o primeiro valor: ");
            A = scan.nextDouble();
            System.out.println("Digite o segundo valor: ");
            B = scan.nextDouble();
            System.out.println("Digite o terceiro valor: ");
            C = scan.nextDouble();
        }

        //Logica
        triangulo = ((0.5) * (A * C));
        circulo = pi * Math.pow(C, 2);
        trapezio = (0.5) * ((A + B) * C);
        quadrado = Math.pow(B, 2);
        retangulo = (A * B);

        //Saida
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}