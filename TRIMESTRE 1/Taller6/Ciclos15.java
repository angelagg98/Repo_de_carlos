package Taller6;

import java.util.Scanner;

public class Ciclos15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        int suma = 0; // acomulador para el valor de la serie 
        String Texto = " "; // representación de la serie 

        for( int i = 1; i <= N; i++){
            int signo = (i % 3 == 0) ?-1:1; // si es multiplo de 3 el signo es negativo
            suma += signo *i;
            Texto += (signo==1 ? " + " : " - ")+ i;
        }
        System.out.print("\nS="+Texto );
        System.out.println("\nEl valor de S es:"+ suma);
        scanner.close();
    }
}
