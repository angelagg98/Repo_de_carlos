package Taller4;

import java.util.Scanner;

public class Anidadas2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("¿cual es tu edad?  ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (edad >= 15) {
            System.out.print("¿Tienes dinero?");
             String nadar = scanner.nextLine();
            if (nadar.contains("si")) {
               System.out.println("Puedes comprar tu entrada");
            }else{
                System.out.println("No puedes entrar, no tienes dinero");
            }
        }else{
            System.out.println("Debes venir acompañado de un adulto");
        }
        scanner.close();
    }
}
