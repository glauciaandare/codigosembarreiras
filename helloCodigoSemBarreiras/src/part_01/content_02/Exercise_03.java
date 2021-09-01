/**
 * Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
 * Escreva um algoritmo que determina o maior também.
 */

package part_01.content_02;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {

       Scanner enter = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int numberFist = enter.nextInt();

        System.out.println("Informe o primeiro numero: ");
        int numberSecond = enter.nextInt();

        if (numberFist == numberSecond) {
            System.out.println("Os dois números são iguais");
        } else if (numberFist > numberSecond) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }
        enter.close();
    }
}
