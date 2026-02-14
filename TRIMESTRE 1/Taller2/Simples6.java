import java.util.Scanner;

public class Simples6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite una nota de 0 al 10:");
        int nota = scanner.nextInt();

        if (nota >= 6) {
          System.out.println("Aprobado");  
        }else{
            System.out.println("Reprobado");
        }
         scanner.close();
    }
}
