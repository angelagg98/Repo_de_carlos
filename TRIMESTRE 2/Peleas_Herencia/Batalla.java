package Peleas_Herencia;

public class Batalla {
    
    public static void main(String[] args) {
        
        Heroe bulat = new Heroe("Bulat", 120, 80, 25);
        Villano general = new Villano("General Esdeath", 150, 90, 20);
        
        System.out.println("\n════════════════════════════════════════════════");
        System.out.println("         ATRIBUTOS INICIALES DE LA BATALLA        ");
        System.out.println("════════════════════════════════════════════════\n");

        bulat.mostrarAtributos();
        System.out.println();

        general.mostrarAtributos();
        System.out.println();

        System.out.println("\n¡Comienza la batalla entre "+bulat.getNombre()+ " y "+general.getNombre()+"! \n");

        general.iceGolem();
        general.escudoHelado();
        bulat.incursio();
        System.out.println();

        general.atacar(bulat);
        bulat.mostrarEstado();

        bulat.atacar(general);
        general.mostrarEstado();
        System.out.println();

        general.atacar(bulat);
        bulat.mostrarEstado();

        general.atacar(bulat);
        bulat.mostrarEstado();
        System.out.println();

        bulat.regeneracion();
        bulat.mostrarEstado();

        bulat.atacar(general);
        bulat.atacar(general);
        general.mostrarEstado();
        System.out.println();

        general.atacar(bulat);
        bulat.mostrarEstado();

        bulat.atacar(general);
        bulat.atacar(general);
        general.mostrarEstado();
        System.out.println();

        bulat.regeneracion();
        bulat.atacar(general);
        bulat.atacar(general);
        bulat.atacar(general);
        general.mostrarEstado();

        System.out.println("\n================ RESULTADO FINAL ================ ");
        bulat.mostrarEstado();
        general.mostrarEstado();

        System.out.println("===================================================\n");

        if(bulat.estaVivito() && !general.estaVivito()){
            System.out.println("¡"+bulat.getNombre()+" ha ganado la batalla! ");
        }else if (general.estaVivito() && !bulat.estaVivito()){
            System.out.println("¡"+general.getNombre()+" ha ganado la batalla!");
        }else{
            System.out.println("\nAmbos siguen luchando...! ");
        }

        System.out.println("===================================================\n");
    }
}