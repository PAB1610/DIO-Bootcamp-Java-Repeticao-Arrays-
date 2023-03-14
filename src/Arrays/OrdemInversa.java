package Arrays;
/**
 * Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa*/
public class OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {5, 10, 15, 20, 30, 40}; //declaracao vetor inserindo numeros
        int contador = 0;

        /** se eu mandar exibir desta forma, aparecerá na tela
         * o endereço do vetor na memoria do pc e não o seu conteúdo.
         * Exemplo: [I@4c873330
         * */
        System.out.println(vetor);
       // System.out.println(vetor.length); //.length retorna o tamanho do vetor

        /**Para exibir os valores inseridos na ordem de cada posição do vetor,
         * precisa-se usar um laço: while ou for*/
        System.out.print("\nVetor: ");
        while (contador < vetor.length) { //como começa com posicao 0, não há posição 6
            System.out.print(vetor[contador] + " ");//colocando o [], programa vai exibir o conteudo do vetor naquela posicao
            contador++;
        }

        System.out.print("\nVetor inverso: ");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
