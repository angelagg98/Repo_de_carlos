package Peleas_Polimorfismo;

public class Batalla {
    
    public static void main(String[] args) {
        
        Personaje[] luchadores = {
            new Heroe("Goku", 30, 100),
            new Villano("Freezer", 25, 120),
            new Saiyajin("Vegeta SSJ", 28, 100),
            new Villano("Cell", 20, 110)
        };


        System.out.println("════════════════════════════════════════════════");
        System.out.println("               INICIA LA BATALLA!               ");
        System.out.println("════════════════════════════════════════════════\n");
        
        for (int i = 0; i < luchadores.length - 1; i++) {
            Personaje atacante = luchadores[i];
            Personaje enemigo = luchadores[i + 1];

            System.out.println("Turno " + (i + 1) + ":");
            atacante.atacar(enemigo);
            enemigo.mostrarEstado();
            System.out.println("--------------------------");
        }
    }
}
