package org.Atividades.Att1004;

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        //Atributos
        int A,B,PROD;

        //Comunicação com usuario
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Digite o valor: ");
            A = scan.nextInt();
            System.out.println("Digite o valor: ");
            B = scan.nextInt();
        }
        
        //Logica
        PROD = A*B;

        //Saida
        System.out.println("PROD = " + PROD);

    }
}
