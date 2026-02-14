package Taller6;

import java.util.Scanner;

public class Ciclos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su pais");
        String pais = scanner.nextLine();

        if (pais.contains("Colombia")) {
            System.out.println("Su gentilicio es: Colombiano/a");
        }else if (pais.contains("Venezuela")) {
            System.out.println("Su gentilicio es: Venezolano/a");
        }else if (pais.contains("Brasil")) {
            System.out.println("Su gentilicio es: Brasileño/a");
        }else if (pais.contains("Ecuador")) {
            System.out.println("Su gentilicio es: Ecuatoreano/a");
        }else if (pais.contains("Peru")) {
            System.out.println("Su gentilicio es: Peruano/a");
        }else if (pais.contains("Bolivia")) {
            System.out.println("Su gentilicio es: Boliviano/a");
        }else if (pais.contains("Chile")) {
            System.out.println("Su gentilicio es: Chileno/a");
        }else if (pais.contains("Argentina")) {
            System.out.println("Su gentilicio es: Argentino/a");
        }else if (pais.contains("Uruguay")) {
            System.out.println("Su gentilicio es: Uruguayo/a");
        }else if (pais.contains("Paraguay")) {
            System.out.println("Su gentilicio es: Paraguayo/a");
        }else {
            System.out.println("Pais no registrado");
        }
    scanner.close();
    }
}
