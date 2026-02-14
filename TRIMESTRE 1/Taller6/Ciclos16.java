package Taller6;

import java.util.Scanner;

public class Ciclos16 {
  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // S: 1-2+3+4-5+6+7-+9+10-11+12...N
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        String Texto = " ";
        int limiteNeg = 1;
        int limitePos = 2;

        int contadorNeg = 0;
        int contadorPos = 0;
        int suma = 0;

        for (int i = 1; i <=N; i++) {
            if (contadorPos < limitePos) {
                Texto = Texto + " + "+i;
                contadorPos = contadorPos + 1;
                suma += +i;
            }else{
                Texto = Texto + " - "+i;
                contadorNeg = contadorNeg +1;
                suma -= +i;
                if(contadorNeg == contadorNeg){
                    contadorNeg = 0;
                    contadorPos = 0;
                }
            }
            
        }
        System.out.println("\n"+"S: "+Texto); //\n es para salto de linea 
        System.out.println("La suma es: "+suma);
        scanner.close();
        
    }      
 }


