package Peleas_Polimorfismo;

public class Personaje {
    private String nombre;
    private int mana;
    private int vitalidad;

    public Personaje (String nombre, int mana , int vitalidad){ 
        this.nombre = nombre;
        this.mana = mana;
        this.vitalidad = vitalidad;

    }

    public void atacar (Personaje enemigo){
        System.out.println(nombre + " ataca con un golpe basico ");
        enemigo.vitalidad -= mana;
        if (enemigo.vitalidad <=0)enemigo.vitalidad = 0;   
    }

    public void mostrarEstado(){
    System.out.println(nombre+ " tiene "+vitalidad+ " puntos de vida restantes.");
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
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre ){
        this.nombre = nombre;
    }
    public int getVitalidad(){
        return vitalidad;
    }
    public void setVitalidad(int vitalidad){
        if (vitalidad >= 0) {
            this.vitalidad = vitalidad;
        }else{
            this.vitalidad = 0;
        }
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        if (mana >= 0) {
            this.mana = mana;          
        }
    }

}