package Taller6;

import java.util.Scanner;

public class Ciclos11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        long factorial = 1; //resultados grandes
         
        System.out.print("\nLos numeros a factorial son: ");
        for(int i = 1; i <= N; i++){
            System.out.println(i + " ");
            factorial *=i;
        }
         System.out.print("\nEl factorial de " + N + " es: " + factorial);
            scanner.close();

    }
}
