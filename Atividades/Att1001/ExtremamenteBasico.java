package org.Atividades.Att1001;

import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) {
        int A,B,X;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digiete o valor A");

        A = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("Digiete o valor B");

        B = scannerB.nextInt();

        X = A + B;

        System.out.println("X = " + X);

    }
}
