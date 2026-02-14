package Taller4;

import java.util.Scanner;

public class Anidadas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cual es tu edad?  ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (edad >= 18) {
            System.out.print("¿sabes nadar?");
             String nadar = scanner.nextLine();
            if (nadar.contains("si")) {
               System.out.println("Puedes ingresar a la piscina");
            }else{
                System.out.println("Debes usar flotador");
            }
        }else{
            System.out.println("Debes de ir acompañado de un adulto");
        }
        scanner.close();
    }
}
