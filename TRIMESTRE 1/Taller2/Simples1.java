import java.util.Scanner;

public class Simples1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite un numero:");
     int numero = scanner.nextInt();
     if (numero >= 0) {
        System.out.println("Positivo");
     }else{
        System.out.println("negativo");
     }
     scanner.close();
    }
}
