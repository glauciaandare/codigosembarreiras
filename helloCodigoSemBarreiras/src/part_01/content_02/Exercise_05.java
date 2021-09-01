/**
 * Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas
 * (adição, subtração, multiplicação e divisão).
 * Todas as operações serão entre dois valores.
 * No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
 */

package part_01.content_02;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar?");
        System.out.println("--------------------------------");
        System.out.println("MENU: ");
        System.out.println("Digite 1: Soma");
        System.out.println("Digite 2: Subtração");
        System.out.println("Digite 3: Divisão");
        System.out.println("Digite 4: Multiplicação");
        int menu = enter.nextInt();

        System.out.println("Digite o primeiro número.");
        int numberFisrt = enter.nextInt();

        System.out.println("Digite o segundo número.");
        int numberSecond = enter.nextInt();

        switch(menu){
            case 1:
                int soma = numberFisrt + numberSecond;
                System.out.println("O resultado da Soma é: " +  soma);
                break;
            case 2:
                int subtracao = numberFisrt - numberSecond;
                System.out.println("O resultado da Subtração é: " +  subtracao);
                break;
            case 3:
                if (numberSecond == 0){
                    System.out.println("Não é possível dividir por zero");
                } else {
                    double divisao = numberFisrt / numberSecond;
                    System.out.println("O resultado da Divisão é: " +  divisao);
                } break;
            case 4:
                int multiplicacao = numberFisrt * numberSecond;
                System.out.println("O resultado da Multiplicação é: " +  multiplicacao);
                break;


        }




        enter.close();

    }
}
