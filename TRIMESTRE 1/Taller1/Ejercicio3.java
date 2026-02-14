
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del Triangulo");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura del Triangulo");      
        int altura = scanner.nextInt() ;
        int area = (base*altura)/2;

        System.out.println("el area del triangulo es:" + area );

        scanner.close();
    }
}
