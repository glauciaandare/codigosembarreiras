/**
 * Escreva um algoritmo para ler o número total de eleitores de um município,
 * o número de votos brancos, nulos e válidos.
 * Calcular e escrever o porcentual que cada um representa em relação ao total do eleitores.
 */

package part_01.content_01;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Informe o número de eleitores do municipio: ");
        int numberVoters = enter.nextInt();

        System.out.println("Informe o número total de votos brancos: ");
        int totalWhiteVotes = enter.nextInt();

        System.out.println("Informe o número total de votos nulos: ");
        int totalNullVotes = enter.nextInt();

        System.out.println("Informe o número total de votos válidos: ");
        int totalValidVotes = enter.nextInt();

        System.out.printf("O percentual de votos brancos é: %.2f%%%n", totalWhiteVotes * 100f / numberVoters);
        System.out.println(String.format("O percentual de votos nulos é: %.2f%%",totalNullVotes * 100f / numberVoters ));
        System.out.printf("O percentual de votos válidos é: %.2f%%%n", totalValidVotes * 100f / numberVoters);



        enter.close();
    }
}


