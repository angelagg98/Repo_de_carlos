package Peleas_Polimorfismo;

public class Saiyajin extends Heroe {
    
    public Saiyajin(String nombre, int mana, int vitalidad) {
        super(nombre, mana, vitalidad);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡KAMEHAMEHA TRIPLE! ");
        
        // Hace triple daño
        int danio = getMana() * 3;
        enemigo.setVitalidad(enemigo.getVitalidad() - danio);
        
        if (enemigo.getVitalidad() < 0) {
            enemigo.setVitalidad(0);
        }
        
        // Auto-daño
        setVitalidad(getVitalidad() - 15);
        if (getVitalidad() < 0) {
            setVitalidad(0);
        }
        
        System.out.println(getNombre() + " pierde 15 HP por el esfuerzo. Vida restante: " + getVitalidad());
    }
}