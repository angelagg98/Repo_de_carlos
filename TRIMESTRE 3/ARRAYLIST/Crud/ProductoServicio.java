package Crud;
import java.util.ArrayList;


public class ProductoServicio {


        ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto( Producto producto){
            productos.add(producto);
            System.out.println( " producto agregado exitosamente");            
        }

        public void listaProductos(){
            if (productos.isEmpty()){
                System.out.println(" No hay productos registrados");
            } else {
                System.out.println("lista de productos");
                for (Producto producto : productos){
                    producto.mostrarInfo();
                    System.out.println("categoria: " + producto.getCategoria());
                }
            }
        }

        public void actualizarProducto(int id, String nuevoNombre, double nuevoPrecio){
            boolean encontrado = false;
            for (Producto producto : productos){
                if (producto.getId() == id){
                    producto.setNombre(nuevoNombre);
                    producto.setPrecio(nuevoPrecio);
                    System.out.println("Producto actualizado exitosamente");
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Producto con id " + id + " no encontrado");

            }

        }

        public void eliminarProducto(int id ){
        boolean encontrado = false;
        for(int i = 0; i < productos.size(); i++){
            if ((productos.get(i).getId() == id)) {
                productos.remove(i);
                System.out.println("\n Producto eliminado exitosamente ");
                encontrado = true;
                break;
            }
        }
          if (!encontrado) {
            System.out.println("Producto con ID " + id + " no encontrado");
        }
    }


       

}











































       /*  boolean continuar = true;

        while (continuar) {
            Producto aServicio = new Producto();

            System.out.println("id: ");
            int idProducto = scanner.nextInt();

            System.out.println("nombre producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.println(" Precio del producto: ");
            double precioProducto = scanner.nextDouble();

            aServicio.setId(idProducto);
            aServicio.setNombre(nombreProducto);
            aServicio.setPrecio(precioProducto);

            listaProductos.add(aServicio);

            System.out.println(" Desea agragar más productos ");

        }

    }*/

