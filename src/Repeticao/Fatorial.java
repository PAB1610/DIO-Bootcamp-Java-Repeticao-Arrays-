package Repeticao;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um numero inteiro
 * fornecido pelo usuario
 * Definição fatorial: decrementar o numero multiplicando.
 * Exemplo: 5! = 120
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero inteiro: ");
        int fatorial = scanner.nextInt();

        int multiplicao = fatorial;

        /** Exemplo de fatorial de 5
         * Multiplicacao comeca valendo o valor do fatorial, no caso, 5
         * o contador i comeca valendo (fatorial - 1), ou seja 4.
         * coloquei uma impressao para testar*/
        for (int i = (fatorial-1); i >= 1 ; i--){
            System.out.println((multiplicao + " x " + i)); // so pra testar calculo
            multiplicao = multiplicao * i;


        }
        System.out.println("O Fatorial é:" + multiplicao);
    }
}
