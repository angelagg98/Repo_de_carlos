package Taller6;

import java.util.Scanner;

public class Ciclospractica {
    //-2-4+6+8+10-12-14+1+18+20...N
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un valor para N: ");
        int N = scanner.nextInt();

        String Texto = "";
        int limiteneg = 1;
        int limitepos = 2;
        
        int contadorneg = 0;
        int contadorpos = 0;

        for(int i = 3; i<=N; i = i + 3){
            if (contadorneg<limiteneg ) {
                Texto = Texto + " - " + i;
                contadorneg = contadorneg + 1;
            }else{
                Texto = Texto + " + "+ i;
                contadorpos = contadorpos + 1;
                if(contadorpos == limitepos){
                    contadorneg = 0;
                    contadorpos = 0;
                    limiteneg ++;
                }
            }
            
        }
        System.out.print("S: " + Texto);
        scanner.close();
    }
}
