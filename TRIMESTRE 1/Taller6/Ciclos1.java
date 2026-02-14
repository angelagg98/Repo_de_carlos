package Taller6;

import java.util.Scanner;

public class Ciclos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tipo de flor es:");
        String tipo = scanner.nextLine();

        System.out.println("Cual es el color: ");
        String color = scanner.nextLine();

        System.out.println("Cual es la cantidad: ");
        int cantidad = scanner.nextInt();
        int Ramo;

        if (tipo.contains("rosas") && color.contains("rojo") && cantidad<=12) {
           Ramo = cantidad*1250; 
           System.out.println(" $" + Ramo);
        }else if (tipo.contains("rosas") && color.contains("rojo") && cantidad>12) {
            Ramo = cantidad*1100;
            System.out.println("$" + Ramo);
        }else if (tipo.contains("rosas")) {
            Ramo = cantidad*1205;
            System.out.println("$" + Ramo);
        }else if (tipo.contains("claveles") && color.contains("blancos") && cantidad<=12) {
             Ramo = cantidad*1050;
             System.out.println("$"+Ramo);
        }else if (tipo.contains("claveles") && color.contains("blanco") && cantidad>12) {
              Ramo = cantidad*1000;
              System.out.println("$"+Ramo);  
        }else if (tipo.contains("claveles")) {
             Ramo = cantidad*1200;
             System.out.println("$"+Ramo);
        }else{
            System.out.println("NO puede realizar la compra");
        }
        scanner.close();
    }
}
