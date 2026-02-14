import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {


        ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto( Producto producto){
            productos.add(producto);
            System.out.println( " producto agregado exitosamente");            
        }

        /*public void listaProductos(){
            if (productos.isEmpty()) {
                System.out.println(" No hay productos registrados ");    

            }else{
                System.out.println( " lista de productos " );
                for( Producto producto : productos){
                    producto.mostrarInfo();
                    System.out.println( " categoria " + producto.getCategoria());
                }
            }
        }*/



            public void listaProductos(){
                for (Producto p : productos) {
                    p.mostrarInfo();
                    System.out.println(" categoria " + p.getCategoria());
                    
                }
            }


            public void actualizarProducto( int id, String nuevoNombre, double nuevoPrecio){
                for ( Producto p : productos) {
                    if (p.getId()==id) {
                        p.setNombre(nuevoNombre);
                        p.setPrecio(nuevoPrecio);
                        break;
                        
                    }
                    
                }
            }

            public void eliminarProducto(int id){
                productos.remove();
                
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

