
package co.edu.ue.model;

import co.edu.ue.entities.Usuario;
import co.edu.ue.util.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDao {
   private ConexionDB conDB;
   PreparedStatement statement = null;
   
   
   public UsuarioDao(){
       conDB =new ConexionDB();
       this.statement = null;
       
   } 
    
   public Usuario addUser(Usuario user){
       Connection con = this.conDB.getConexionDB();
       String query = "INSERT usuarios VALUES(null,?,?,?,?,?)";
       try{
           if(this.statement == null){
               this.statement = con.prepareStatement(query);
               this.statement.setString(1,user.getNames());
               this.statement.setString(2,user.getLastNames());
               this.statement.setString(3,user.getDocument());
               this.statement.setString(4,user.getEmail());
               this.statement.setString(5,user.getPassword());
               int response = this.statement.executeUpdate();
               if(response > 0 ) JOptionPane.showMessageDialog(null, "Se ha agregado un usuario");
           }
               
       }catch (Exception e){
           System.out.println(""+e.toString());
       }finally{
           if(con!=null){
               try {
                   this.statement.close();
                   con.close();
               } catch (Exception e) {
                   System.out.println(""+e.toString());
               }
           }
       }
       
       return user;
   }
}
