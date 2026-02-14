abstract class vehiculos {

private String marca;
private String modelo;
private int anio;



public vehiculos ( String marca, String modelo, int anio){
    this.marca = marca;
    this.modelo= modelo;
    this.anio = anio;
    }
 
    public String getMarcar(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
        
    }


    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
        
    }


    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
        
    }


    public void mostrarInfo(){
        System.out.println("marca" + marca + "modelo" + modelo + "anio" + anio);

     }

     public abstract void mover();


}

