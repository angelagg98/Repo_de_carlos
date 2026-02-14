public class Moto extends vehiculos {

    public Moto (String marcar, String modelo, int anio){
        super(marcar, modelo, anio);
        
    }

    @Override
    public void mover(){
        System.out.println("La moto se desplaza sobre dos ruedas");
    }

    
}
