package org.Atividades.Att1006;

import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        //Atributos
        double A,B,C, Media;
        double pesoA = 2, pesoB = 3, pesoC = 5;

        //Comunicação com usuario
        Scanner ScannerA = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        A = ScannerA.nextDouble();
        Scanner ScannerB = new Scanner(System.in);
        System.out.println("Digite o segundo valor: ");
        B = ScannerB.nextDouble();
        Scanner ScannerC = new Scanner(System.in);
        System.out.println("Digite o terceiro valor: ");
        C = ScannerC.nextDouble();

        //Logica
        Media = ((A * pesoA)+(B * pesoB)+(C * pesoC))/(pesoA+pesoB+pesoC);

        //Saida
        System.out.println("MEDIA = " + Media);

    }

}
