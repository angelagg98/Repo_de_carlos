import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("El nombre es: " + nombre );

        scanner.close();
    }
}
