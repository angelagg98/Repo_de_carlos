import java.util.Scanner;

public class Simples7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = scanner.nextInt();

        if (numero >=1) {
         if (numero<=100) {
          System.out.println("Su numero esta entre el 1 y 100:" + numero);  
         }else{
             System.out.println("Su numero NO esta entre el 1 y 100:" + numero);
         }     
        }else{
            System.out.println("Su numero NO esta entre el 1 y 100:" + numero);
        }
        scanner.close();
    
    }
}
