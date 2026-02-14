package Taller6;

import java.util.Scanner;

public class Ciclos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIgite el primer numero: ");
        int c = scanner.nextInt();

        System.out.println("Digite el segundo numero: ");
        int d = scanner.nextInt();

        System.out.println("Digite el tercer numero: ");
        int u = scanner.nextInt();
 
        String texto = "El numero es: ";

        switch(c){
            case 1:
                texto +="Ciento ";
                break;
            case 2:
                texto +="Doscientos ";
                break;
            case 3:
                texto +="Trescientos ";
                break;
            case 4:
                texto +="Cuatrocientos ";
                break;
            case 5:
                texto +="Quinientos ";
                break;
            case 6:
                texto +="Seiscientos ";
                break;
            case 7:
                texto +="Setecientos ";
                break;
            case 8:
                texto +="Ochocientos ";
                break;
            case 9:
                texto +="Novecientos ";
                break;
        
        }
        switch (d) {
            case 1:
                texto +="Diez";
                break;
            case 2:
                texto +="Veinte";
                break;
            case 3:
                texto +="Treinta";
                break;
            case 4:
                texto +="Cuarenta";
                break;
            case 5:
                texto +="Cincuenta";
                break;
            case 6:
                texto +="Sesenta";
                break;
            case 7:
                texto +="Setenta";
                break;
            case 8:
                texto +="Ochenta";
                break;
            case 9:
                texto +="Noventa";
                break;
           
        }
         switch (u) {
            case 1:
                texto +=" y Uno";
                break;
            case 2:
                texto +=" y Dos";
                break;
            case 3:
                texto +=" y Tres";
                break;
            case 4:
                texto +=" y Cuatro";
                break;
            case 5:
               texto +=" y Cinco ";
                break;
            case 6:
                texto +=" y Seis ";
                break;
            case 7:
                texto +=" y Siete ";
                break;
            case 8:
                texto +=" y " + " Ocho ";
                break;
            case 9:
                texto +=" y Nueve ";
                break;
          } 
          System.out.println(texto);        
        scanner.close();
        }
}
