

public class Usuario {
    private int id;
    private String nombre;

    public Usuario (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }


    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id = id;
    }

    public String getnombre(){
        return nombre;
    }   

    public void setnombre( String nombre){
        this.nombre = nombre; 
    }


    @Override
    public String toString(){
        return "id: " + id + " nombre: " + nombre;
    }

}
