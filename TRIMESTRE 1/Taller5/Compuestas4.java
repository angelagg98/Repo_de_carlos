package Taller5;

import java.util.Scanner;

public class Compuestas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es su promedio");
        int promedio = scanner.nextInt();

        System.out.println("¿Cual es su estrato");
        int estrato = scanner.nextInt();

        if (promedio>= 90  && estrato<= 2) {
            System.out.println(" Obtiene beca");
        }else{
            if (promedio>=95) {
                System.out.println(" Obtiene beca");
            }else{
                System.out.println(" NO obtiene beca");
            }
        }
        scanner.close();
    }
}
