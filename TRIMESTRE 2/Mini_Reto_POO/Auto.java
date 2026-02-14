public class Auto extends Vehiculos { // AUTO HEREDA DE VEHICULOS, TENDRA AUTOMATICAMENTE TODOS LOS ATRIBUTOS DE LA CLASE PADRE (HERENCIA)

    public Auto(String marca, String modelo, double velocidad, double combustible){         // CONSTRUCTOR, SUPER: LLAMA AL CONSTRUCTOR DE LA CLASE PADRE 
        super(marca, modelo, velocidad, combustible);
    }

    @Override       // SOBREESCRIBIR UN METODO DE LA CLASE PADRE (POLIMORFISMO)
    public double calcularConsumo(double distancia){
        double rendimiento = 12.0;
        return distancia / rendimiento;
    }
    
}
