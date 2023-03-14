package Repeticao;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer
 * numero inteiro entre 1 e 10.
 * o usuario deve informar de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme exemplo abaixo:
 *
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50*/
public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de "+ tabuada + ":"); // impressao cabeçalho

        //i é o contador semelhante ao contador
        // como é a declaracao do for
        //declaracao - limite - incremento
        for (int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + " x "+ (i) + " = " + (i*tabuada));
        }

    }
}
