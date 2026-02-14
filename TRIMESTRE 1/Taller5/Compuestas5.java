package Taller5;

import java.util.Scanner;

public class Compuestas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto pagas anual? : $");
        int anual = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("¿Eres socio activo?");
        String socio = scanner.nextLine();

        if (anual>500 && socio.equals("si")) {
           System.out.println("Eres admitido al club"); 
        }else{
            System.out.println("¿eres invitado especial con carta de recomendación? ");
            String invitado = scanner.nextLine();
          
            if (invitado.equals("si")) {
                System.out.println("Eres admitido al club");
            }else{
                System.out.println("NO puedes ser admitido");
            }
         scanner.close();
        }
    }
}
