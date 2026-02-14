package Taller6;

import java.util.Scanner;

public class Ciclos14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        double suma = 0;// acumulador con numeros decimales 
        // primer termino (i=1 )lo imprimimos antes del ciclo
        suma += 1.0/(1*1);
        System.out.print("S= 1/1\u00B2 ");// \u00B2 es el codigo unicode para exponente 2
        // Ciclo desde 3 hasta N ( solo impares)
        for(int i = 3; i <= N; i +=2){
            suma += 1.0/(i*i);
            System.out.print("+1/"+i+"\u00B2 ");

        }
        System.out.print("\nEl valor de S es: "+ suma);
        scanner.close();
    }
}
