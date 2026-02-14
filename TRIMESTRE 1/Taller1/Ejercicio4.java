import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de metros a convertir:");
        int metros = scanner.nextInt();

        int centimetros = (metros*100);

        System.out.println("La cantidad de centimetros son:" + centimetros );
        scanner.close();

    }
}
