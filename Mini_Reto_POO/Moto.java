public class Moto extends Vehiculos {

    public Moto(String marca, String modelo, double velocidad, double combustible){
        super(marca, modelo, velocidad, combustible);
    }

    @Override
    public double calcularConsumo(double distancia){
        double rendimiento = 20.0;
        return distancia / rendimiento;
    }
    
}
