package org.Atividades.Att1010;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        //Atributos
        int codigoPecaA, codigoPecaB, numeroPecaA, numeroPecaB;
        double valorPecaA, valorPecaB, valorAPagar;

        //Comunicacao com Usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o código da primeira peça: ");
        codigoPecaA = scan.nextInt();
        System.out.println("Digite o numero de peças sendo levado: ");
        numeroPecaA = scan.nextInt();
        System.out.println("Informe o valor da peça: ");
        valorPecaA = scan.nextDouble();
        System.out.println("Digite o código da segunda peça: ");
        codigoPecaB = scan.nextInt();
        System.out.println("Digite o numero de peças sendo levada: ");
        numeroPecaB = scan.nextInt();
        System.out.println("Informe o valor desta peça: ");
        valorPecaB = scan.nextDouble();

        //Logica
        valorAPagar = ((numeroPecaA * valorPecaA)+(numeroPecaB * valorPecaB));

        //Saida
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorAPagar);
    }
}
