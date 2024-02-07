package Amstrong;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {


       Scanner keyboard = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        String  numero = keyboard.nextLine();
        char[] n = numero.toCharArray();
        int n1 = n.length;
         int[] nuevo = numero.chars().toArray();
        System.out.println(nuevo);

        System.out.println(n1);


    }
}
