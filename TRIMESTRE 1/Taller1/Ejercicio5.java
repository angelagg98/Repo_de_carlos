import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la cantidad de respuestas correctas");
        int correctas = scanner.nextInt();

        System.out.println("Escriba la cantidad de respuestas incorrectas");
        int incorrectas = scanner.nextInt();

        System.out.println("Escriba la cantidad de respuestas en blanco");
        int blanco = scanner.nextInt();

        int puntaje = (correctas*4) + (incorrectas*-1) + (blanco*0);
        System.out.println("El puntaje final del postulante es:" + puntaje );
        scanner.close();
    }
}

