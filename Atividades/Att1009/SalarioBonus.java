package org.Atividades.Att1009;

import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        //Atributos
        String nome;
        double salarioFixo, totalDeVendas, total;

        //Comunicacao com Usuario
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Digiete o nome do vendedor: ");
            nome = scan.nextLine();
            System.out.println("Digite o seu salario: ");
            salarioFixo = scan.nextDouble();
            System.out.println("Digite o seu total de vendas: ");
            totalDeVendas = scan.nextDouble();
        }

        //Logica
        total = salarioFixo + (totalDeVendas * 0.15);

        //Saida
        System.out.println("TOTAL = " + total);

    }
}
