package Taller5;

import java.util.Scanner;

public class Compuestas9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Su certificado esta vigente?");
        String vigente = scanner.nextLine();

        System.out.println("¿Fuma?");
        String Fuma = scanner.nextLine();

        if (vigente.contains("si") && Fuma.contains("no")) {
            System.out.println("Es aceptado en la competencia");
        }else{
            System.out.println("¿Tienes algun permiso especial?");
            String permiso = scanner.nextLine();

            if (permiso.contains("si")) {
             System.out.println("Es aceptado en la competencia");   
            }else{
                System.out.println("NO es aceptado");
            }
        }
        scanner.close();
    }
}
