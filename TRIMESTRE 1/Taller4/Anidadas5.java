package Taller4;

import java.util.Scanner;

public class Anidadas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre de usuario?");
        String usuario = scanner.nextLine();

        if (usuario.contains("Admin")) {
            System.out.println("¿Cual es tu contraseña?");
            int contraseña = scanner.nextInt();
           
            if (contraseña == 1234) {
                System.out.println("Bienvenido administrador");
            }else{
                System.out.println("Contraseña incorrecta");
            }
        }else{
            System.out.println("Usuario no encontrado: " + usuario);
        }
        scanner.close();
    } 
}
