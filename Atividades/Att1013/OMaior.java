package org.Atividades.Att1013;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        //Atributos
        int A, B, C, maior;

        //Comunicação com o usuario
        try (Scanner scan = new Scanner(System.in))
        {
            System.out.println("Digite o primeiro valor: ");
            A = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            B = scan.nextInt();
            System.out.println("Digite o terceiro valor: ");
            C = scan.nextInt();
        }

        //Logica
        if (A >= B && A >= C) {
            maior = A;
        } else if (B >= A && B >= C) {
            maior = B;
        } else {
            maior = C;
        }

        //Saida
        System.out.println(maior + " eh o maior");
    }
}
