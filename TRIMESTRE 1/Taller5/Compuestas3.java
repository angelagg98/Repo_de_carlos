package Taller5;

import java.util.Scanner;

public class Compuestas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        System.out.println("¿Cuantos años de experiencia tiene? ");
        int experiencia = scanner.nextInt();

        if (edad>25 && experiencia>=5) {
            System.out.println("Obtiene licencia especial");
        }else{
            if (edad>30) {
             System.out.println("Obtiene licencia especial");
           }else{
            System.out.println("NO obtiene licencia");
           } 
        }    
        scanner.close();
    }
}
