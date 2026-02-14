package Taller4;

import java.util.Scanner;

public class Anidadas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es su promedio? ");
        int promedio = scanner.nextInt();

        if (promedio>=9) {
              System.out.println("¿Cual es su nivel socioeconómico? ");
              int nivel = scanner.nextInt();
            if (nivel <=2) {
               System.out.println("Beca del 100% "); 
            }else{
                System.out.println("Beca del 50% ");
            }
        }else{
            System.out.println("NO aplica para beca");
        }
        scanner.close();
    }
}
