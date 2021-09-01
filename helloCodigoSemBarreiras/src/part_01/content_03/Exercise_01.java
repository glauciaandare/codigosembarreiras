/**
 * Construa um algoritmo que leia 10 valores inteiros e positivos e:
 *
 * Encontre o maior valor
 * Encontre o menor valor
 * Calcule a média dos números lidos Esse exercício foi dado na aula 3
 * e agora vamos otimizar ele utilizando o while e for.
 */

package part_01.content_03;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        double somaDosNumeros = 0;
        int numeroCorrente = 0;


        Scanner scanner = new Scanner(System.in);

        int quantiadeDeNumeros = 3;

        for (int contador = 1; contador <=quantiadeDeNumeros; contador++) {
            System.out.printf("Digite o %dº número", contador);

            numeroCorrente = scanner.nextInt();

            if (numeroCorrente > maiorNumero) {
                maiorNumero = numeroCorrente;
            }

            if (numeroCorrente < menorNumero) {
                menorNumero = numeroCorrente;
            }

            somaDosNumeros = somaDosNumeros + numeroCorrente + 0.0;
        }

        System.out.println("Maior número " + maiorNumero);
        System.out.println("Menor número " + menorNumero);
        System.out.println("Média " + somaDosNumeros / quantiadeDeNumeros);
    }

}
