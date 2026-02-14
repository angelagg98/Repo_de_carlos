package Taller6;

import java.util.Scanner;

public class Ciclos12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        System.out.print("Digite un valor para M: ");
        int M = scanner.nextInt();

        int suma = 0;

        System.out.print("Los "+ N + " primeros multiplos de "+ M + " son: ");
        for(int i = 1; i <= N; i++){
            int multiplo = i * M;
            System.out.print(multiplo + " ");
            suma += multiplo;
        }
        System.out.print("\nla suma de los multiplos es: " + suma );
        scanner.close();
    }
}
