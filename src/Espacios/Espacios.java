package Espacios;

import java.util.Scanner;

public class Espacios {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);

        String frase;
        int contador =0;

        do {
            System.out.println("Introducir frases: ");
             frase = keyboard.nextLine();

             char [] nuevo = frase.toCharArray();
            for (char c : nuevo) {
                if (c == ' ') {
                    contador++;
                }
            }

        }while (!frase.contains("."));
        System.out.println("los espacios son: " + contador);


    }
}
