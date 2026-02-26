

import java.util.ArrayList;
import java.util.List;

public class UsuarioAPI{


    
    private List<Usuario> listaUsuarios = new ArrayList<>();
    

    public List<Usuario> obtenerUsuarios(){
        return listaUsuarios;
    }


    public void crearUsuario(Usuario usuario){
       listaUsuarios.add(usuario);
       System.out.println("Usuario creado exitosamente");
    }

    public Usuario obtenerPorId(int id){
        return listaUsuarios.stream()
        .filter(u -> u.getid() == id)
        .findFirst()
        .orElse(null);
    }


            public void eliminarUsuario( int id){
                for ( int i = 0; i < listaUsuarios.size(); i++){
                    if ((listaUsuarios.get(i).getid()== id)){
                        listaUsuarios.remove(i);
                        System.out.println("Usuario eliminado exitosamente");
                        break;
                    }
                        
                    }
                }

            public void actualizarUsuario(int id, String nuevoNombre){
                for (Usuario usuario : listaUsuarios){
                    if (usuario.getid() == id){
                        usuario.setnombre(nuevoNombre);
                        System.out.println("Usuario actualizado exitosamente");
                        break;
                    }
                }

            }
        }
