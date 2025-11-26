public class Auto extends Vehiculos {

    public Auto(String marca, String modelo, double velocidad, double combustible){
        super(marca, modelo, velocidad, combustible);
    }

    @Override
    public double calcularConsumo(double distancia){
        double rendimiento = 12.0;
        return distancia / rendimiento;
    }
    
}
