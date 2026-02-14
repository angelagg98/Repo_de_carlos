package Taller6;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIgite el primer numero: ");
        int c = scanner.nextInt();

        System.out.print("Digite el segundo numero: ");
        int d = scanner.nextInt();

        System.out.print("Digite el tercer numero: ");
        int u = scanner.nextInt();

        String[] centena = {"","Cien","Doscientos","Trescientos","Cuatrocientos","Quinientos","Seiscientos","Setecientos","Ochocientos","Novecientos"};

        String[] decena = {"","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};

        String[] unidad = {"","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};

        System.out.println("El numero es: " + centena[c] + " "+ decena[d] + " y "+unidad[u]);
        scanner.close();
    }
}
