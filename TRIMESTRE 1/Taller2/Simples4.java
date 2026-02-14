import java.util.Scanner;

public class Simples4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite numero1 :");
        int numero1 = scanner.nextInt();

        System.out.println("Digite numero2 :");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
          System.out.println("Numero 1 es mayor: " + numero1 );  
        }else{
          System.out.println("Numero 2 es mayor: " + numero2 );
        }
         scanner.close();
        
    }
}
