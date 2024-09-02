package org.Atividades.Att1003;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        //Atributos
        int A,B, SOMA;

        //Comunicacao com o usuario
        try (Scanner scanner= new Scanner(System.in)){
            System.out.println("Digite o Valor de A : ");
            A = scanner.nextInt();
            System.out.println("Digite o Valor de B : ");
            B = scanner.nextInt();
        }

        //Logica
        SOMA = A+B;

        //Saida
        System.out.println("SOMA = " + SOMA);
    }
}
