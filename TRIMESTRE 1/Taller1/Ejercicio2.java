
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo");
        int base = scanner.nextInt();
        System.out.println("ingresa la altura del triangulo");
        int altura = scanner.nextInt();

        int area = (base*altura)/2;

        System.out.println("el area del triangulo es:" + area );
       
        scanner.close();
    }
}
