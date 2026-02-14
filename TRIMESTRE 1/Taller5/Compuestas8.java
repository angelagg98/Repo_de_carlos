package Taller5;

import java.util.Scanner;

public class Compuestas8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos meses llevas con la compañia:");
        int meses = scanner.nextInt();

        System.out.println("Cuantos datos consume (GB):");
        int datos = scanner.nextInt();

        if (meses>12 && datos>10) {
            System.out.println("SI aplica al plan especial");
        }else{
            if (meses>24) {
                System.out.println("Si aplica al plan especial");
            }else{
                System.out.println("NO aplica al plan");
            }
        }
        scanner.close();
    }
}
