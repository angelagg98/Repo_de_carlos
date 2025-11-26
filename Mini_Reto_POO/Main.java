import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos vehiculos desea registrar?");
        int cantidad = scanner.nextInt();

        Vehiculos[] vehiculos = new Vehiculos[cantidad];

        for (int i = 0; i < cantidad; i++){
            System.out.println("\n Vehiculo "+ (i+1));
            System.out.print("Tipo (1=Auto, 2=Moto): ");
            int tipo = scanner.nextInt();

            scanner.nextLine();
            
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Velocidad (km/h): ");
            double velocidad = scanner.nextDouble();
            
            System.out.print("Combustible (litros): ");
            double combustible = scanner.nextDouble();

           if (tipo == 1) {
                vehiculos[i] = new Auto(marca, modelo, velocidad, combustible);
            } else if (tipo == 2) {
                vehiculos[i] = new Moto(marca, modelo, velocidad, combustible);
            }
        }
        System.out.println("\n INFORMACION DE LOS VEHICULOS");
        System.out.print("Ingrese la distancia a recorrer (km): ");
        double distancia = scanner.nextDouble();
      
        double consumoTotal = 0;

           for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("\n Vehiculo " + (i + 1));
            System.out.println("Marca: " + vehiculos[i].getMarca());
            System.out.println("Modelo: " + vehiculos[i].getModelo());
            
            double consumo = vehiculos[i].calcularConsumo(distancia);
            System.out.println("Consumo: " + consumo + " litros");
            
            consumoTotal += consumo;
        }

        System.out.println("\n CONSUMO TOTAL DE LOS VEHICULOS ");
        System.out.println("Consumo total: " + consumoTotal + " litros");
        
        scanner.close();

    }

}
        //Vehiculos[] vehiculos = new Vehiculos[4];
        //vehiculos[0] = new Auto("Toyota", "Corolla", 180, 50);
        //vehiculos[1] = new Moto("Honda", "CBR", 200, 15);
        //vehiculos[2] = new Auto("Ford", "Mustang", 220, 60);
        //vehiculos[3] = new Moto("Yamaha", "R1", 250, 18);