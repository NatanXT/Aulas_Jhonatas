package org.Atividades.Att1018;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        //Atributos
        int valorTotal, restante, quantidadeNotas, notas[] = {100,50,20,10,5,2,1};

        //Comunicação com o usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        valorTotal = scan.nextInt();

        //Logica
        restante = valorTotal;
        for (int nota : notas) {
            quantidadeNotas = restante/nota;
            restante = restante % nota;//Ele puxa o resto da conta exemplo: 576 % 100 = 76 o resto da divisão

            //Saida
            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeNotas, nota);
        }
    }
}
