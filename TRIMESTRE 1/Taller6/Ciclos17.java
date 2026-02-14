package Taller6;

import java.util.Scanner;

public class Ciclos17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        int suma = 0;
        String texto = " ";
    
        for(int i = 1; i <= N*2; i++){
            if(i % 2 !=0){
                texto += " + " + i;
                suma++;
                
                 
            }
            if(i == N * 2){
                texto += "      "+suma +"\u00B2 = "+ suma * suma;
                  System.out.println(suma + i);
            }

        }
        
        System.out.println(texto );
        scanner.close();
    }
}
