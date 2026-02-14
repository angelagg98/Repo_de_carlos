package Taller6;

import java.util.Scanner;

public class ciclos13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        String texto = " "; // almacena la serie 
        boolean esPositivo = true; // indica si el siguiente numero es positivo o negativo
        int suma = 0; // acomulador de resultado 

        for(int i = 1; i <= N; i++){
            
            if (esPositivo) {
                texto = texto + " + " + i ;
                suma += i;// sumamos si es positivo
                esPositivo = false;// cambia a negativo

                
            }else{
                texto = texto + " - " + i ;
                suma -= i;// restamos si es negativo
                esPositivo = true;// cambia a postivo
            }
        }
        System.out.print("S="+ texto);
        System.out.print("La suma es:"+ suma);
        scanner.close();
    }
}
