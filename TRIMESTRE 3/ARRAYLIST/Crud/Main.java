package Crud;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductoServicio servicio= new ProductoServicio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    agregarProducto(servicio, scanner);
                    break;

                case 2:
                    servicio.listaProductos();
                    break;

                case 3:
                    actualizarProducto(servicio, scanner);
                    break;

                case 4:
                    eliminarProducto(servicio, scanner);
                    break;

                case 5:
                    System.out.println("Sali...");
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor seleccione una opcion del menu.");
            }

        } while (opcion != 4);
        scanner.close();
    }

    public static void agregarProducto(ProductoServicio servicio, Scanner scanner) {
        System.out.println(" AGREGAR PRODUCTO ");
        System.out.println("Tipo de producto:\n ");
        System.out.println("1. Tecnología");
        System.out.println("2. Alimentos");
        System.out.print("Seleccione: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        
        Producto producto = null;
        
        if (tipo == 1) {
            producto = new ProductoTecnologia(id, nombre, precio);
        } else if (tipo == 2) {
            producto = new ProductoAlimento(id, nombre, precio);
        } else {
            System.out.println("Tipo no válido");
            return;
        }
        
        servicio.agregarProducto(producto);
    }

    public static void actualizarProducto(ProductoServicio servicio, Scanner scanner) {
        System.out.println(" ACTUALIZAR PRODUCTO ");
        System.out.print("ID del producto a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        
        System.out.print("Nuevo precio: ");
        double nuevoPrecio = scanner.nextDouble();
        
        servicio.actualizarProducto(id, nuevoNombre, nuevoPrecio);
    }

    public static void eliminarProducto(ProductoServicio servicio, Scanner scanner) {
        System.out.println(" ELIMINAR PRODUCTO ");
        System.out.print("ID del producto a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        servicio.eliminarProducto(id);
    }

    
}