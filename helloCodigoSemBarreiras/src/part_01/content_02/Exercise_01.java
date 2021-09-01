/**
 * Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
 */

package part_01.content_02;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Informe o número a ser verificado: ");
        int number = enter.nextInt();

        if (number % 2 == 0) {
            System.out.println(" O numero informado " + number + " é par! ");
        } else
            System.out.println("O numero informado " + number + " é impar! ");


        enter.close();
    }
}
