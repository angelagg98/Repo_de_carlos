

public class Vehiculos { //se crea una clase llamada Vehiculo "Clase padre"
    private String marca;
    private String modelo;                    //atributos privados, solo en esta clase se pueden acceder directamente a ellos "ENCAPSULAMIENTO"
    private double velocidad ;
    private double combustible;

    public Vehiculos (String marca, String modelo, double velocidad, double combustible){ 
    this.marca = marca;
    this.modelo = modelo;                 // constructor, que es el metodo que se usa para crear un vehiculo con sus datos iniciales  recibe 4 parametros 
    this.velocidad = velocidad;
    this.combustible = combustible;
    }
    public String getMarca (){
        return marca;                         // Getters y setters, para los atributos privados, se nesecita para acceder y modificar desde fuera de la clase padre                                                  
    }                                           // Get : metodo para obtener (leer)  Set: metodo para establecer (cambiar)  "ENCAPSULAMIENTO"
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getModelo (){
        return modelo;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public double getVelocidad (){
        return velocidad;
    }
    public void setVelocidad (double velocidad){
        this.velocidad = velocidad;
    }
    public double getCombustible (double combustible){
        return combustible;
    }
    public void setCombustible (double combustible){
        this.combustible = combustible;
    }
    public double calcularConsumo(double distancia){            // Metodo para calcular consumo, calcula cuanto combustible gasta el vehiculo segun la distancia recorrida
        double rendimiento = 10.0;                          //10.0 el vehiculo recorre 10 Km por cada cada litro (variable local) solo se puede utilizar en este metodo
        return distancia / rendimiento;                    // cuantos litros nesecito "regresa un valor"
        
    }
    
    
}
