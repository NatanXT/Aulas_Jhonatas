package org.Atividades.Att1007;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        //Atributos
        int A, B, C, D, Diferenca;

        //Comunicação com o Usuario
        Scanner scannerA = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        A = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Digite o segundo valor: ");
        B = scannerB.nextInt();
        Scanner scannerC = new Scanner(System.in);
        System.out.println("Digite o terceiro valor: ");
        C = scannerC.nextInt();
        Scanner scannerD = new Scanner(System.in);
        System.out.println("Digite o quarto valor: ");
        D = scannerD.nextInt();

        //Logica
        Diferenca = ((A * B)-(C * D));

        //Saida
        System.out.println("DIFERENCA = " + Diferenca);
    }
}
