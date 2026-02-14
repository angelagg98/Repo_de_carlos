package Taller5;

import java.util.Scanner;

public class Compuestas10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Cuanto suman sus ingresos?" );
        int ingresos = scanner.nextInt();

        System.out.println("¿Cuantos años lleva en su ultimo trabajo?");
        int años = scanner.nextInt();

        if (ingresos>= 2000 && años>=2) {
            System.out.printf("Aprueba el prestamo");
        }else{
            if (ingresos>=5000) {
                System.out.println("Aprueba el prestamo");
            }else{
                System.out.println("NO aprueba el prestamo");
            }
        }
        scanner.close();
    }
}
