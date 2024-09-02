package org.Atividades.Att1007;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        //Atributos
        int A, B, C, D, Diferenca;

        //Comunicação com o Usuario
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Digite o primeiro valor: ");
            A = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            B = scan.nextInt();
            System.out.println("Digite o terceiro valor: ");
            C = scan.nextInt();
            System.out.println("Digite o quarto valor: ");
            D = scan.nextInt();
        }

        //Logica
        Diferenca = ((A * B)-(C * D));

        //Saida
        System.out.println("DIFERENCA = " + Diferenca);
    }
}
