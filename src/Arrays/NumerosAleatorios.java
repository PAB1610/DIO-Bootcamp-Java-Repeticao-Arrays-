package Arrays;

import java.util.Random;

/**
 * Fazer um programa que leia 20 numeros inteiros aleatorios entre 0 e 100.
 * Armazene esses numeros num vetor.
 * Ao final, mostre os numeros e seus sucessores
 * Exemplo: numeroAleatorio 15, 20 ...
 * Mostrar os sucessores: 16, 21....*/

public class NumerosAleatorios {
    public static void main(String[] args) {
        //classe Random que gera numeros aleatorios
        Random random = new Random();

        int[] numerosAleatorios = new int[20]; //declaracao vetor 20 posicoes

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(0, 100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNumeros Aleatorios: ");

        /**imprimir o numero da posicao*/
        for (int valor : numerosAleatorios) {
            System.out.print(valor + " ");
            
        }

        System.out.print("\n\nNumeros Sucessores: ");

        /**imprimir o sucessor (adicionar uma unidade ao numero) do numero fo for de cima*/
        for (int valor : numerosAleatorios) {
            System.out.print((valor+1) + " ");//valor+1 pq é o numero acrescido de 1

        }

        System.out.print("\nNumeros Antecessores: ");

        /**imprimir o antecessor (diminuir uma unidade ao numero) do numero gerado na lista*/
        for (int valor : numerosAleatorios) {
            System.out.print((valor-1) + " ");//valor-1 pq é o numero decrescido de 1

        }
    }
}
