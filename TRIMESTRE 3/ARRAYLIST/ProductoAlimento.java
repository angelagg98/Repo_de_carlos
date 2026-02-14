public class ProductoAlimento extends Producto{

        public ProductoAlimento( int id, String nombre, double precio){
        super(id, nombre, precio);
    }

    @Override
    public String getCategoria(){
        return "Alimento ";
    }
    
}
