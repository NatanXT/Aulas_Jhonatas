package org.Atividades.Att1005;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        //Atributos
        double A,B,Media;
        double pesoA = 3.5;
        double pesoB = 7.5;
        //Comunicação com o usuario
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Digite a Primeira Nota: ");
            A = scan.nextDouble();
            System.out.println("Digite a Segunda Nota: ");
            B = scan.nextDouble();
        }
        //Logica
        Media = ((A * pesoA) + (B * pesoB))/(pesoA + pesoB);
        //Resultado
        System.out.println("MEDIA = " + Media);
    }
}
