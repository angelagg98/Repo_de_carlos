public class Moto extends Vehiculos {               //MOTO HEREDA DE LA CLASE PADE "VEHICULOS", 

    public Moto(String marca, String modelo, double velocidad, double combustible){             //CONSTRUCTOR DE MOTO
        super(marca, modelo, velocidad, combustible);
    }

    @Override           //SOBREESCRIBIR EL METODO PADRE 
    public double calcularConsumo(double distancia){
        double rendimiento = 20.0;
        return distancia / rendimiento;
    }
    
}
