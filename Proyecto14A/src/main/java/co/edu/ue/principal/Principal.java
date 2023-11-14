
package co.edu.ue.principal;

import co.edu.ue.entities.Usuario;
import co.edu.ue.model.UsuarioDao;
import co.edu.ue.util.ConexionDB;


public class Principal {

    public static void main(String[] args) {
       
        /*ConexionDB cdb = new ConexionDB();*/
        
        Usuario usuario = new Usuario("Sara", "Otero", "12212121", "saraot@gmail.com", "cocaina");
        UsuarioDao dao = new UsuarioDao();
        System.out.println(dao.addUser(usuario));
    }
}
