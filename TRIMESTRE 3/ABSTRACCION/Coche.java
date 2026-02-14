public class Coche extends vehiculos{

    public Coche (String marcar, String modelo, int anio){
        super(marcar, modelo, anio);

    }

    @Override
    public void mover(){
        System.out.println("el coche se desplaza sobre cuatro ruedas");
    }

    
}
