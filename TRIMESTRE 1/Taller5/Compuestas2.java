package Taller5;

import java.util.Scanner;

public class Compuestas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su edad?");
        int edad = scanner.nextInt();

        System.out.println("¿Cual es su estatura");
        int estatura = scanner.nextInt();
   
        scanner.nextLine();

        if (edad>12 && estatura >= 150) {
            System.out.println("Puede ingresar al parque");
        }else{
            System.out.println("¿Esta acompañado?");
            String acompañado = scanner.nextLine();
           
            if (acompañado.contentEquals("si")) {
                System.out.println("Puedes ingresar al parque");
            }else{
                if (acompañado.contentEquals("no")) {
                   System.out.println("No puedes ingresar al parque"); 
                }else{
                    System.out.println("Respuesta invalida. Escriba solo 'SI' o 'NO");
                }
                
            }
        scanner.close();
        }
    }
}
