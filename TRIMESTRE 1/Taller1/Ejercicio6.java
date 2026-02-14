import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuantas horas laboraste este mes?");
        int horas = scanner.nextInt();

        System.out.println("la tarifa por hora es:");
        int tarifa = scanner.nextInt();

        int sueldo = (horas*tarifa);
        System.out.printf("Su sueldo es: $%,d%n",sueldo);

        scanner.close();

    }
}
