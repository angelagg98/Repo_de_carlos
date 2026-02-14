package Taller5;

import java.util.Scanner;

public class Compuestas7 {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        System.out.println("¿Cual es su rating?");
        int rating = scanner.nextInt();

        if (edad>15 && rating >1800) {
            System.out.println("Puede inscribirse ");
        }else{
            if (rating>2000) {
                System.out.println("Puede inscribirse");
            }else{
                System.out.println("NO se puede inscribir");
            }
        }
        scanner.close();
    }
}
