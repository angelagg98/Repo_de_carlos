import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nota1");
        int nota1 = scanner.nextInt();

        System.out.println("Digite su nota2");
        int nota2 = scanner.nextInt();

        System.out.println("Digite su nota3");
        int nota3 = scanner.nextInt();

        System.out.println("Digite su nota4");
        int nota4 = scanner.nextInt();

        int promedio = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Su promedio es" + promedio);
        scanner.close();
    }
}
