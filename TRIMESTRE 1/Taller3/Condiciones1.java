package Taller3;

import java.util.Scanner;

public class Condiciones1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero entre 50 y 100:");
        int numero = scanner.nextInt();
        if (numero >= 50) {
          if (numero<= 100) {
            System.out.println("Su numero es VALIDO");
          }else{
            System.out.println("Su numero es INVALIDO");
          }
          }else{
            System.out.println("Su numero es INVALIDO");
          }
          scanner.close();
    }
}

