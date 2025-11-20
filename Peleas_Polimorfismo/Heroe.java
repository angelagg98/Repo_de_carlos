package Peleas_Polimorfismo;

public class Heroe extends Personaje{

    public Heroe(String nombre, int mana, int vitalidad) {
        super(nombre, mana, vitalidad);
    }
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡KAMEHAMEHA! ");
        
        int danio = getMana() * 2;
        enemigo.setVitalidad(enemigo.getVitalidad() - danio);
        
        if (enemigo.getVitalidad() < 0) {
            enemigo.setVitalidad(0);
        }
    }
}

