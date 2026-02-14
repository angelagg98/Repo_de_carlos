package Taller6;

import java.util.Scanner;

public class Ciclos5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
      
         System.out.println("Digite su dia de nacimiento");
         int Dia = scanner.nextInt();
       
         System.out.println("Digite su mes de nacimiento");
         int mes = scanner.nextInt();
        
         String texto = "Su fecha de nacimiento es: ";
        
        switch (Dia) {
            case 1:
               texto  +="uno ";
                break;
            case 2:
               texto +="Dos ";
                break;
            case 3:
               texto +="Tres ";
                break;
            case 4:
               texto +="Cuatro ";
                break;
            case 5: 
               texto +="Cinco ";
                break;
            case 6:
               texto +="Seis ";
                break;
            case 7:
               texto +="Siete ";
                break;
            case 8:
               texto +="Ocho ";
                break;
            case 9:
               texto +="Nueve ";
                break;
            case 10:
               texto +="Diez ";
                break;
            case 11:
               texto +="Once ";
                break;
            case 12:
               texto +="Doce ";
                break;
            case 13:
               texto +="Trece ";
                break;
            case 14:
               texto +="Catorce ";
                break;
            case 15:
               texto +="Quince ";
                break;
            case 16:
               texto +="Diesiseies ";
                break;
            case 17: 
               texto +="Diesisiete ";
                break;
            case 18:
               texto +="Diesiocho ";
                break;
            case 19:
               texto +="Diesinueve ";
                break;
            case 20:
               texto +="veinte ";
                break;
            case 21:
               texto +="Veintiuno ";
                break;
            case 22:
               texto +="Veintidos ";
                break;
            case 23:
               texto +="Veintitres ";
                break;
            case 24:
               texto +="Veinticuatro ";
                break;
            case 25:
               texto +="Venticinco ";
                break;
            case 26:
               texto +="Ventiseis ";
                break;
            case 27:
               texto +="Ventisiete ";
                break;
            case 28:
               texto +="Veintiocho ";
                break;
            case 29: 
               texto +="Veintinueve ";
                break;
            case 30:
               texto +="Treinta ";
                break;
            case 31:
               texto +="Treintayuno " ;
                break;     
        }

        switch (mes) {
            case 1:
               texto +="de Enero";
                break;
            case 2:
               texto +="de Febrero";
                break;
            case 3:
               texto +="de Marzo";
                break;
            case 4:
               texto +="de Abril";
                break;
            case 5: 
               texto +="de Mayo";
                break;
            case 6:
               texto +="de Junio";
                break;
            case 7:
               texto +="de Julio";
                break;
            case 8:
               texto +="de Agosto";
                break;
            case 9:
               texto +="de Septiembre";
                break;
            case 10:
               texto +="de Octubre";
                break;
            case 11:
               texto +="de Noviembre";
                break;
            case 12:
               texto +="de Diciembre";
                break;
            default:
               texto +="Su numero es invalido";
                break;
        }
        System.out.println(texto);
        scanner.close();
    }
}
