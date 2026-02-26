import java.util.Scanner;

public class MainS {

    public static void main(String[] args) {
        
        UsuarioAPI api = new UsuarioAPI();

        api.crearUsuario(new Usuario(1, "angela"));
        api.crearUsuario(new Usuario(2, "maria"));

        System.out.println("Usuarios creados:" + api.obtenerUsuarios().size());
        for ( Usuario u : api.obtenerUsuarios()){
            System.out.println(u);{

        }
       
        
      

        api.actualizarUsuario(1, "isabella");
        System.out.println("usuario Actualiza: ");
        for(Usuario i: api.obtenerUsuarios()){
            if(u.getid() == 1){
                System.out.println(u);
            }
        }
    
        

        api.eliminarUsuario(2);
        System.out.println("Usuario eliminado: id: 2 nombre: maria");
        
        System.out.println("nUsuarios restantes: " + api.obtenerUsuarios().size());
        for (Usuario u1 : api.obtenerUsuarios()) {
            System.out.println(u1); // imprime: ID: 1 | Nombre: isabella
        }


        
    }


    }

}
