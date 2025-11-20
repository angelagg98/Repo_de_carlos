package Peleas_Herencia;

public class Personaje {
    
    private String nombre;
    private int vitalidad;
    private int mana;
    private int ataque;


public Personaje(String nombre, int vitalidad, int mana, int ataque){
    this.nombre = nombre;
    this.vitalidad = vitalidad;
    this.mana = mana;
    this.ataque = ataque;
    
}
public void atacar(Personaje enemigo){
    System.out.println(nombre + " ataca a "+enemigo.nombre+ " causando "+ataque+ " puntos de daño. ");
    enemigo.vitalidad -= ataque;

    if (enemigo.vitalidad <=0)enemigo.vitalidad = 0;      
    
}
public void mostrarEstado(){
    System.out.println(nombre+ " tiene "+vitalidad+ " puntos de vida restantes.");
}
public void mostrarAtributos(){
    System.out.println("════════════════════════════════════");
    System.out.println("  Nombre: " + nombre);
    System.out.println("  Vitalidad: " + vitalidad + " HP");
    System.out.println("  Mana: " + mana);
    System.out.println("  Ataque: " + ataque);
    System.out.println("════════════════════════════════════");
}
public boolean estaVivito(){
     boolean estaVivito = true;
    if (vitalidad > 0) {
        estaVivito = true;    
    
    }else{
      estaVivito = false;
    }
    return estaVivito ;
    
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre ;
}
public int getVitalidad(){
    return vitalidad;
}
public void setVitalidad( int vitalidad){
    if(vitalidad < 0){ 
        this.vitalidad = 0;
    }else{ 
    this.vitalidad = vitalidad;
    }
}
public int getMana(){
    return mana;
}
public void setMana( int mana){
    if (mana < 0) {
        this.mana = 0;
    }else{ 
    this.mana = mana;
    }
}
public int getAtaque(){
    return ataque ;
}
public void setAtaque(int ataque){
    if (ataque < 0) {
        this.ataque = 0;
    }else { 
    this.ataque = ataque;
    }
}
}