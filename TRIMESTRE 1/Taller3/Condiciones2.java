package Taller3;

import java.util.Scanner;

public class Condiciones2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Digite nota1 y nota2:");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();

        if (nota1 >= 6) {
            if (nota2 >=6) {
             System.err.println("Aprobado");   
            }else{
                System.err.println("Debe recuperar");
            }
        }else{
             System.err.println("Debe recuperar");
        }
        scanner.close();
    }
}
