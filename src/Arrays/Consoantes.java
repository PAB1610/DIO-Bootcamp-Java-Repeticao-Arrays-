package Arrays;

import java.util.Scanner;

/**
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes
 * foram lidas. Imprima as consoantes*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6]; //array é um objeto
        int quantidade_consoantes = 0;

        int contador = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();

            //se não a, e i, o, u, consoantes na posicao recebe letra;
            // metodo equalsIgnoreCase(), ignora se a letra digitada é maiuscula ou minuscula
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[contador] = letra;
                quantidade_consoantes++;
            }

            contador++;
        } while (contador < consoantes.length);

        /*imprimir usando for
        for (int i=0; i<consoantes.length;i++){
            System.out.print(consoantes[i] + " ");
        }*/

        System.out.print("\nConsoantes: ");

        /** imprimir usando foreach
         * Lê-se: Para cada elemento dentro desse array chamado consoantes,
         * eu quero que você imprima  o elemento naoVogal*/
        for (String naoVogal : consoantes) {
            if(naoVogal!=null)
                System.out.print(naoVogal + " ");
        }
    }
}
