package CalculosNeperianos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double numRaiz;
        double log = 0;
        System.out.print("Introduzca un numero para calcular logaritmo nepereano:");
        try {
            log = Double.parseDouble(keyboard.nextLine());

        } catch (ArithmeticException e) {
            System.out.println("introducir solo numeros");
        }

        System.out.print("Introduce un numero para sacar su raiz cuadrada: ");

        try {
            numRaiz = Double.parseDouble(keyboard.nextLine());
            System.out.println("el numero neperiano es: " + CalculosNeperianos.numNeo(log));
            System.out.println("La raiz cuadrada es: " + CalculosNeperianos.raiz(numRaiz));
        } catch (ArithmeticException e) {
            System.out.println("introducir solo numeros");
        }


    }
}
