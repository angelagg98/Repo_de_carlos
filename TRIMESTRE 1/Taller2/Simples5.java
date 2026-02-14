import java.util.Scanner;

public class Simples5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int numero = scanner.nextInt();

        if (numero %5 == 0) {
         System.out.println("Su numero es multiplo de 5 :" + numero);   
        }else{
            System.out.println("Su numero NO es multiplo de 5 :" + numero);
        }
         scanner.close();
    }
}
