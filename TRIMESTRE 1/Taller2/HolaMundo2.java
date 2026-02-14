import java.util.Scanner;

public class HolaMundo2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println();
     int numero = scanner.nextInt();
     if (numero > 0) {
        System.out.println("Es positivo");
     }else{
       if (numero < 0) {
         System.out.println("Es negativo");
        }else {
            System.out.println("CERO");
        }
     }
     scanner.close();
    }
}
