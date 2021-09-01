/**
 * Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
 * A seguir utilizando apenas atribuições de variáveis, troque os seus conteúdos, fazendo com que o
 * valor que está em Y passe para Z e vice-versa.
 * Ao final, escrever os valores que ficaram armazenados na variáveis.
 */


package part_01.content_01;

public class Exercise_01 {

    public static void main(String[] args) {
        int number_y = 99;
        int number_z = 11;

        if (number_y > number_z ){
            number_y = number_y + number_z;
            number_z = number_y - number_z;
            number_y = number_y - number_z;
        }

        System.out.println("Valor de Y: " + number_y);
        System.out.println("Valor de Z: " + number_z);
    }
}
