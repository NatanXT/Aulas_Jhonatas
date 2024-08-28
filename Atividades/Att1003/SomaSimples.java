package org.Atividades.Att1003;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        int A,B, SOMA;

        Scanner scannerA= new Scanner(System.in);
        System.out.println("Digite o Valor de A : ");
        A = scannerA.nextInt();
        Scanner scannerB= new Scanner(System.in);
        System.out.println("Digite o Valor de B : ");
        B = scannerB.nextInt();

        SOMA = A+B;

        System.out.println("SOMA = " + SOMA);
    }
}
