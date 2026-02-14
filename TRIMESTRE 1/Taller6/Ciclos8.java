package Taller6;

import java.util.Scanner;

public class Ciclos8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un valor para N:");
        int N = scanner.nextInt();
        int suma = 0;
        
        System.out.println("Los numeros del 1 al " + N + " son : ");
        
        for(int i = 1; i <= N; i = i + 1){
            System.out.println(i +"");
            suma = suma + i;
         }
         System.out.println("La suma de los numeros del 1 al " + N + " es:" + suma);
   
       scanner.close();
     }
    
}
