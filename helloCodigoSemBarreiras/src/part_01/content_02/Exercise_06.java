/**
 * Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô).
 * O algoritmo deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t])
 * e deverá fazer o mesmo para o jogador 2.
 * No final da execução o algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
 */

package part_01.content_02;

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println(" Jogador 1 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
        int jogador1 = enter.nextInt();

        System.out.println("Jogador 2 - Digite 0 para PEDRA, 1 para PAPEL ou 2 para TESOURA: ");
        int jogador2 = enter.nextInt();

        if (jogador1 == jogador2)
            System.out.println("Empate");
        else if (jogador1 - jogador2 == -2 || jogador1 - jogador2 == 1)
            System.out.println("Jogador 1 venceu!");
        else
            System.out.println("Jogador 2 venceu!");

        enter.close();
    }
}
