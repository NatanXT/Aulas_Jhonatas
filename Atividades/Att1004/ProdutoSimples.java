package org.Atividades.Att1004;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        int A,B,PROD;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        A = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        B = scannerB.nextInt();

        PROD = A*B;

        System.out.println("PROD = " + PROD);

    }
}
