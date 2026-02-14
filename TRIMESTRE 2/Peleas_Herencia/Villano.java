package Peleas_Herencia;

public class Villano extends Personaje {
    
    public Villano(String nombre, int vitalidad, int mana,int ataque){
        super(nombre, vitalidad, mana, ataque);
    }
     public void iceGolem(){
        System.out.println(getNombre()+ " grita !golem de hielo¡, (crea una armadura de hielo y aumenta sus atributos)");
        setAtaque(getAtaque()+ 10) ;
        setVitalidad(getVitalidad()+ 10);
    }
    public void escudoHelado(){
    int defensaExtra = 30;
    System.out.println(getNombre() + " crea un ESCUDO DE HIELO y gana " + defensaExtra + " puntos de vida!");
    setVitalidad(getVitalidad() + defensaExtra);
    }
}