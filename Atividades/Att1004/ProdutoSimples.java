package org.Atividades.Att1004;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        //Atributos
        int A,B,PROD;

        //Comunicação com usuario
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        A = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        B = scannerB.nextInt();

        //Logica
        PROD = A*B;

        //Saida
        System.out.println("PROD = " + PROD);

    }
}
