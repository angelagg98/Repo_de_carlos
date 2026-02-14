package Taller5;

import java.util.Scanner;

public class compuestas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuanto es el valor de la compra?");
        int valor = scanner.nextInt();
        scanner.nextLine();//

        System.out.println("¿Que dia de la semana es?");
        String dia = scanner.nextLine();

        if (valor >50 && (dia.equals("lunes")|| dia.equals("viernes"))) {
             System.out.println("Puede participar en el sorteo");
        }else{
             System.out.println("¿Cual es su metodo de pago?");
             String pago = scanner.nextLine();

             if (pago.equals("tarjeta")) {
                 System.out.println("Puede participar en el sorteo");
             }else{
                 System.out.println("NO PUEDE PARTICIPAR");
             }
        }
        scanner.close();
    }
}
