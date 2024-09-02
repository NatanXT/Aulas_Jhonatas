package org.Atividades.Att1008;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //Atributos
        int numero, horasTrabalhadas;
        double salario, valorHorasTrabalhadas;

        //Comunicação Usuario
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Digite o seu numero: ");
            numero = scan.nextInt();
            System.out.println("Digite a sua hora trabalhada: ");
            horasTrabalhadas = scan.nextInt();
            System.out.println("Digite o valor da sua hora trabalhada: ");
            valorHorasTrabalhadas = scan.nextDouble();
        }

        //Logica
        salario = (horasTrabalhadas * valorHorasTrabalhadas);

        //Saida
        System.out.println("NUMERO = " + numero + "\n" + "SALARY = R$ " + salario + "\n");
    }
}
