package Peleas_Polimorfismo;

public class Villano extends Personaje {
    
    public Villano(String nombre, int mana, int vitalidad) {
        super(nombre, mana, vitalidad);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡RAYO DE LA MUERTE! ");
        
        int danio = (int)(getMana() * 1.5);  // Daño x1.5
        enemigo.setVitalidad(enemigo.getVitalidad() - danio);
        
        if (enemigo.getVitalidad() < 0) {
            enemigo.setVitalidad(0);
        }
    }
}
