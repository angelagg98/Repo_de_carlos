package Taller6;

import java.util.Scanner;

public class Ciclospractica2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        String Texto = "";
        int limiteneg = 2;
        int limitepos = 2;
        
        int contadorneg = 0;
        int contadorpos = 0;

        for(int i = 10; i<=N; i = i + 10){
            if (contadorpos<limitepos ) {
                Texto = Texto + " + " + i;
                contadorpos = contadorpos + 1;
            }else{
                Texto = Texto + " - "+ i;
                contadorneg = contadorneg + 1;
                if(contadorneg == limiteneg){
                    contadorneg = 0;
                    contadorpos = 0;
                    limitepos ++;
                }
            }
            
        }
        System.out.print(Texto);
        scanner.close();
    }
}

