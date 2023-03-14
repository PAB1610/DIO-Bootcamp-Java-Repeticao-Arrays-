package Repeticao;

import java.util.Scanner;

/***
 * Faça um programa que leia 5 numeros e informe:
 * o maior valor e a media desses numeros
 *
 * Usando estrutura DO - WHILE
 */

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        int contador = 0;

        int maior = 0;

        double soma = 0;

        do {
            System.out.println("Digite um numero inteiro: ");
            numero = scanner.nextInt();

            if (numero>maior)
                maior=numero;

            soma = soma + numero;

            contador = contador + 1;


        } while (contador < 5);

        System.out.println("Maior numero é: " + maior);
        System.out.println("Media é: " + (soma/5));

    }
}
