package Repeticao;

/**
 * Faça um program que peça N numeros inteiros, calcule e mostre a
 * quantidade de numero pares e a quantidade de numeros impares
 */
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade_numeros = 0;
        int contador = 0;
        int numero = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite uma quantidade de numeros: ");
        quantidade_numeros = scanner.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0) //se o resto da divisao do numero informado por 2 for 0
                pares++;
            else
                impares++;

            contador++;

        } while(contador<quantidade_numeros);

        System.out.println("Quantidade numeros pares: " + pares);
        System.out.println("Quantidade numeros impares: " + impares);
    }
}
