package org.Atividades.Att1001;

import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) {
        //Atributos
        int A,B,X;

        //Comunicação com usuario
        try (Scanner scannerA = new Scanner(System.in)) {
            System.out.println("Digiete o valor A");
            A = scannerA.nextInt();
            Scanner scannerB = new Scanner(System.in);
            System.out.println("Digiete o valor B");
            B = scannerB.nextInt();

            //Logica
            X = A + B;

            //Saida
            System.out.println("X = " + X);

        }
    }
}
