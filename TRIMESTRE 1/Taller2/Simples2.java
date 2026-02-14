import java.util.Scanner;

public class Simples2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero:");
        int numero = scanner.nextInt();
       
        if (numero %2 == 0 ) {
            System.out.println( "Su numero es par:" + numero );
        }else{
            System.out.println("Su numero es impar:" + numero );
        }
        scanner.close();
    }
}
