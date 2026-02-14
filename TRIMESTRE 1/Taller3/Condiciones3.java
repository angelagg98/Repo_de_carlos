package Taller3;

import java.util.Scanner;
public class Condiciones3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿es de noche?");
        String noche = scanner.nextLine();
       
        if (noche.contains("si")) {
          System.out.println("¿es fin de semana?");
          String semana = scanner.nextLine();   
           if (semana.contains("si")) {
            System.out.println("puedes descansar");
           }else{
            System.out.println("Puedes descansar");
           }
        }else{
            System.out.println("No puedes descansar");
        }
       scanner.close();
    }
}
