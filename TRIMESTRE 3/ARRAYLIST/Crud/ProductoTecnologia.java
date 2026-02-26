package Crud;
public class ProductoTecnologia extends Producto {

    public ProductoTecnologia( int id, String nombre, double precio){
        super(id, nombre, precio);
    }

    @Override
    public String getCategoria(){
        return "Tecnologia";
    }
    
}
