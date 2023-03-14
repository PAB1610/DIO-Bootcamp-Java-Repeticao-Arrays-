package Repeticao;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

/**
 * Fazer programa que leia conjuntos de 2 valores, nome do aluno e sua idade
 * Pare programa ao inserir o valor 0 no campo nome */

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        // a ideia é que este código se repita até que nome == 0


        while (true) {
            System.out.println("Nome:");
            nome = scanner.next(); //metodo .next() captura um valor string
            if (nome.equals("0")) //.equals() compara valor da string ao valor entre parenteses.
                break;

            System.out.println("Idade: ");
            idade = scanner.nextInt(); //metodo .nextInt() captura um valor inteiro
        }

        System.out.println("Fim!");
    }
}