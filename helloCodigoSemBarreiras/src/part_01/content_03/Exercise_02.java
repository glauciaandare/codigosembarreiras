/**
 * Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
 */

package part_01.content_03;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Qual o número que deseja saber o fatorial?");
        double numero = enter.nextInt();

        long fatorial = 1;

        while (numero > 1) {
             fatorial = (long) (fatorial * numero);
            numero = numero - 1;
        }

        System.out.printf("O fatorial é %d", fatorial);

        enter.close();
    }

}

