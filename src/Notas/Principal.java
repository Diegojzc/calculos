package Notas;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Introduzca la notra de matematicas: ");
        int matematicas = Integer.parseInt(keyboard.nextLine());
        System.out.print("Introduzca la nota de fisica: ");
        int fisica = Integer.parseInt(keyboard.nextLine());
        System.out.print("Introduzca la nota de quimica:");
        int quimica = Integer.parseInt(keyboard.nextLine());
        System.out.print("Introduzca la nota de lenguaje: ");
        int lenguaje = Integer.parseInt(keyboard.nextLine());
        System.out.print("Introduzca la note de Historia:");
        int historia= Integer.parseInt(keyboard.nextLine());

        int suma = matematicas+ fisica+ quimica+ lenguaje+ historia;
        int media = suma/5;

        if (media<3){
            System.out.println("la nota media es: " + media + " es muy deficiente");
        }if (media > 3 && media < 5 ){
            System.out.println("la nota media es : " + media + " es insuficiente ");
        }
        if (media >= 5 && media <=6 ){
            System.out.println("la nota media es : " + media + " es suficiente ");
        }if (media >=6 && media <=7 ){
            System.out.println("la nota media es : " + media + " es bien ");
        }
        if (media > 7 && media <=9 ){
            System.out.println("la nota media es : " + media + " es notable ");
        }if (media >=9 ){
            System.out.println("La nota media es : " + media + " es sobresaliente");
        }


    }
}
