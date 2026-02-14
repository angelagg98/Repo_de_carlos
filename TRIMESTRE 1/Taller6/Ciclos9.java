package Taller6;

import java.util.Scanner;

public class Ciclos9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un valor para N: ");
        int N = scanner.nextInt();

        int suma = 0;

        System.out.println("Los primeros " + N + " numeros pares son: ");
        for(int i = 1; i <= N; i++){
            int par = i* 2;
            System.out.println(par + "  ");
            suma += par;
         }
            System.out.println("\nLa suma de los primeros  " + N + " pares es: " + suma );
            scanner.close();
    }
}
