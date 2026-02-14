package Taller5;

import java.util.Scanner;

public class Compuestas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite su saldo total,");
        int saldo = scanner.nextInt(); //
        scanner.nextLine();
      
        System.out.println("¿Es cliente frecuente?");
        String frecuente = scanner.nextLine();
        
        
        if ((saldo>100 && frecuente.contains("si")) ||  ( saldo>200)) {
            System.out.println("Descuento del 20%");
        
        }else{
            System.out.println("NO aplica descuento");
        }
        scanner.close();
    }
}
