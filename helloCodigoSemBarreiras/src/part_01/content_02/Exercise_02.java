/**
 * Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
 *
 * Infantil A = 5 a 7 anos
 * Infantil B = 8 a 11 anos
 * Juvenil A = 12 a 13 anos
 * Juvenil B = 14 a 17 anos
 * Adultos = Maiores de 18 anos
 */

package part_01.content_02;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Digite uma idade");
        int age = enter.nextInt();

        if (age >= 5 && age <= 7) {
            System.out.println("Nadador é da classe Infantil A");
        } else if (age >= 8 && age <= 11) {
            System.out.println("Nadador é da classe Infantil B");
        } else if (age >= 12 && age <= 13) {
            System.out.println("Nadador é da classe Juvenil A");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Nadador é da classe Juvenil B");
        } else if (age >= 18) {
            System.out.println("Nadador é da classe Adulto");
        } else {
            System.out.println("Nadador é Pessoa menor de 5 anos");
        }


        enter.close();
    }

}
