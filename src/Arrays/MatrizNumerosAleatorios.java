package Arrays;

import java.util.Random;

/**Crie um programa que gere e imprima uma matriz M 4x4 com valores aleatorios
 * entre 0 e 9*/

public class MatrizNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizM = new int[4][4];

        //escrever em matriz, usando for, guardar este código
        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j< matrizM[i].length; j++){ //matrizM[i].length LÊ-se matriz M na linha 0 com tamanho 4
                matrizM[i][j] = random.nextInt(0,9);
            }
        }

        System.out.println("Matriz: ");

        //foreach para percorrer matriz. Guardar este código
        for (int[] linha : matrizM) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println(); //comando para pular linha
        }
    }
}
