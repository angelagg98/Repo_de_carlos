import java.util.Scanner; // LEER DATOS QUE ESCRIBA EL USUARIO 

public class Main {
    public static void main(String[] args) { // DONDE EMPIEZA EL EL PROGRAMA
        Scanner scanner = new Scanner(System.in); // OBJETO PARA LEER LO QUE EL USUARIO ESCRIBA 
        System.out.println("¿Cuantos vehiculos desea registrar?");
        int cantidad = scanner.nextInt(); // LEE UN NUMERO ENTERO QUE ESCRIBA EL USUARIO Y LO GUARDA EN CANTIDAD 

        Vehiculos[] vehiculos = new Vehiculos[cantidad];  // ARREGLO PARA GUARDAR TODOS LOS VEHICULOS 

        for (int i = 0; i < cantidad; i++){         // FOR PARA PEDIRLE AL USUARIO LOS DATOS DE CADA VEHICULO( REPITE EL CODIGO SEGUN CUANTOS VEHICULOS QUIERA REGISTRAR)
            System.out.println("\n Vehiculo "+ (i+1)); // i ES UN CONTADOR QUE VA DE 0 A 1, ES PARA MOSTRAR (VEHICULO 1, VEHICULO 2, ETC)
            System.out.print("Tipo (1=Auto, 2=Moto): ");//PREGUNTAMOS SI QUIERE REGISTRAR  UN Auto (1) O UNA Moto (2)   "PRINT: IMPRIME PERO SIN SALTAR DE LINEA "
            int tipo = scanner.nextInt();

            scanner.nextLine(); //LIMPIA EL BUFFER " TECNICO"
            
            System.out.print("Marca: ");        // creando una varible temporal, variablr que solo existe en metodo main                         // ESTO ES PARA PEDIR LOS DATOS DE CADA VEHICULO
            String marca = scanner.nextLine();        // lee el texto 
            
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            
            System.out.print("Velocidad (km/h): ");
            double velocidad = scanner.nextDouble();        //LEE NUMEROS DECIMALES
            
            System.out.print("Combustible (litros): ");
            double combustible = scanner.nextDouble();

           if (tipo == 1) {     // SI EL USUARIO ESCRIBE 1, CREA UN Auto
                vehiculos[i] = new Auto(marca, modelo, velocidad, combustible);     //vehiculos[i] GUARDA EL VEHICULO EN LA POSICION i DEL ARRAY = new Auto CREA EL OBJETO CON LOS DATOS QUE PEDIMOS  "POLIMORFISMO"
            } else if (tipo == 2) {     //SI ESCRIBIO 2, CREA UNA Moto
                vehiculos[i] = new Moto(marca, modelo, velocidad, combustible);
            }
        }
        System.out.println("\n INFORMACION DE LOS VEHICULOS");          // PREGUNTAMOS CUANTOS Km VA A RECORRER EL VEHICULO Y GUARDAMOS ESA DISTANCIA EN UNA VARIABLE, CON ESTA DISTANCIA CALCULAMOS EL COMBUSTIBLE QUE GASTA CADA VEHICULO 
        System.out.print("Ingrese la distancia a recorrer (km): ");
        double distancia = scanner.nextDouble();
      
        double consumoTotal = 0; // SE CREA UNA VARIBLE QUE EMPIEZA EN 0 AQUI SE VA SUMANDO EL CONSUMO DE CADA VEHICULO, AL FINAL TENEMOS EL CONSUMO TOTAL, VARIABLE PARA IR SUMANDO EL CONSUMO TOTAL

           for (int i = 0; i < vehiculos.length; i++) {     // RECORRE TODO EL ARRAY DE VEHICULOS  "vehiculos.length: es el tamaño del array (cuantos vehiculos hay )"
            System.out.println("\n Vehiculo " + (i + 1));
            System.out.println("Marca: " + vehiculos[i].getMarca());        //vehiculos [i]: accede al vehiculo en la posicion i , " get: usa los getters para obtener los datos" "ENCAPSULAMIENTO"
            System.out.println("Modelo: " + vehiculos[i].getModelo());
            
            double consumo = vehiculos[i].calcularConsumo(distancia); // LLAMA AL METODO CALCULAR CONSUMO DEL VEHICULO, GUARDAMOS EL RESULTADO EN LA VARIBLE CONSUMO 
            System.out.println("Consumo: " + consumo + " litros");
            
            consumoTotal += consumo;  //ES LO MISMO QUE consumoTotal = consumoTotal +consumo (vamos sumando)
        }

        System.out.println("\n CONSUMO TOTAL DE LOS VEHICULOS ");
        System.out.println("Consumo total: " + consumoTotal + " litros"); //consumoTotal ya tiene la suma de todos los consumos 
        
        scanner.close();

    }

}
        //Vehiculos[] vehiculos = new Vehiculos[4];
        //vehiculos[0] = new Auto("Toyota", "Corolla", 180, 50);
        //vehiculos[1] = new Moto("Honda", "CBR", 200, 15);
        //vehiculos[2] = new Auto("Ford", "Mustang", 220, 60);
        //vehiculos[3] = new Moto("Yamaha", "R1", 250, 18);