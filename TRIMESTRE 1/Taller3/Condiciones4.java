package Taller3;

import java.util.Scanner;

public class Condiciones4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero:");
        int numero = scanner.nextInt();

        if (numero >0) {
            if (numero <100) {
              System.out.println("Dentro del rango");  
            }else{
                System.out.println("Fuera del rango");
            }
        }else{
            System.out.println("Fuera del rango");
        }
        scanner.close();
    }
}
