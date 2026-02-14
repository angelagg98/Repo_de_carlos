
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su edad");
        int edad = scanner.nextInt();
        System.out.println("Digite su peso");
        int peso = scanner.nextInt();
        System.out.println("su edad es: " + edad+" y su peso es: " + peso);
       
        scanner.close();
    }
}
