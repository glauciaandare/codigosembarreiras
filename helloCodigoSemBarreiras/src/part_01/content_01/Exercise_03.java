/**
 * Escreva um algoritmo para ler as dimenções de um retangulo(base e altura).
 * Calcular e escrever a área do retangulo.
 */

package part_01.content_01;

import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Informe o valor da base do triângulo: ");
        int valueBase = enter.nextInt();

        System.out.println("Informe o valor da altura do triângulo: ");
        int height = enter.nextInt();

        double area = valueBase * height / 2;

        System.out.println(" A área do triangulo é: " + area + " cm2 ");

        enter.close();

    }

}
