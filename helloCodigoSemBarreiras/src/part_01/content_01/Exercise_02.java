/**
 * Escreva um algoritmo para ler um valor(do teclado) e escrever (na tela) o seu antecessor.
 */


package part_01.content_01;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int number = enter.nextInt();

       int numberPre = number - 1;

        System.out.println("Numero Antecessor de " + number + " é " + numberPre);



        enter.close();

    }
}
