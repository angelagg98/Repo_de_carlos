public class main {

    public static void main(String[] args) {

        vehiculos[] flota = {
         new Coche("mazda", "sedas ", 2023),
         new Moto("yamaha", "125", 2025)
            };


        for( vehiculos v : flota){
            v.mostrarInfo();
            v.mover();
        }
    
    }



    
}
