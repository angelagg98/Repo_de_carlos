package Taller4;


import java.util.Scanner;

public class Anidadas3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("¿cual es tu edad? ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cual es el genero del videojuego (Terror, Accíon, infantil)?");
        String genero = scanner.nextLine();

        if (edad < 18) {
            if (genero.contains("terror")) {
             System.out.println("No puedes comprar este juego");   
            }else{
               System.out.println("Compra realizada");
               System.out.println("¿Tienes dinero para comprarlo?");  
               String dinero = scanner.nextLine();   
               if (dinero.contains("si")) {
               System.out.println("Compra realizada");
               }else{
               System.out.println("No tines saldo suficiente");
               }
            }
        }else{
          System.out.println("¿Tienes dinero para comprarlo?");  
          String dinero = scanner.nextLine();
             if (dinero.contains("si")) {
             System.out.println("Compra realizada");
            }else{
            System.out.println("No tines saldo suficiente");
            }     
             scanner.close();
        }               
    }
}
