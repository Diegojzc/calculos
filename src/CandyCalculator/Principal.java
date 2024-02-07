package CandyCalculator;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int [] golosinas = new int[3];
        System.out.print("Introduce el numero de cupones: ");
        int cupones = Integer.parseInt(keyboard.nextLine());

        golosinas[0] = cupones/10;
        golosinas[1] = (cupones%10)/3;
        golosinas[2] = (cupones%10)%3;

        System.out.println("las barras de caramelos son: " + golosinas[0]);
        System.out.println("los chicles son: " + golosinas[1]);
        System.out.println("El restante es : " + golosinas[2]);



    }

}
