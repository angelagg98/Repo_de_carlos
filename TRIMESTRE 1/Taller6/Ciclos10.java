package Taller6;

import java.util.Scanner;

public class Ciclos10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        int suma = 0;

        System.out.print("Los primeros " + N + " numeros impares son: ");

        for(int i = 1; i <= N; i++){
            int impar = i*2 -1; 
            System.out.println(impar + "  ");
            suma += impar;

        }
            System.out.print("\nla suma de los primeros " + N + " impares es: " + suma);
            scanner.close();
    }
}
