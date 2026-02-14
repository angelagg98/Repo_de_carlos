package Peleas_Herencia;

public class Heroe extends Personaje{
    
    public Heroe(String nombre, int vitalidad, int mana, int ataque){
        super(nombre, vitalidad, mana, ataque);
    }

    public void incursio(){
        System.out.println(getNombre()+ " Grita !incursio¡ y aumenta sus atributos... ");
        setAtaque(getAtaque() + 15);
        setVitalidad( getVitalidad() + 20);

    }
    public void regeneracion(){
    int vidaRecuperada = 15;
    System.out.println(getNombre() + " se regenera y recupera " + vidaRecuperada + " puntos de vida.");
    setVitalidad(getVitalidad() + vidaRecuperada);
}
}
