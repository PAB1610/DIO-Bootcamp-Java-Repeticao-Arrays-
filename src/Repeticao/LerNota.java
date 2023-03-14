package Repeticao;

import java.util.Scanner;

/**
 * Fazer um programa que leia uma nota entre 0 e 10.
 * Caso o usuario digite um valor que não seja válido
 * que seja repetida uma mensagem até que o usuario digite um valor
 * válido
 * */
public class LerNota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        //programa so entrará neste loop se a nota nao estiver entre 0 e 10
        while (nota < 0 || nota > 10){
            System.out.println("Nota invalida! Digite novamente:");
            nota = scanner.nextInt();
        }

    }
}
