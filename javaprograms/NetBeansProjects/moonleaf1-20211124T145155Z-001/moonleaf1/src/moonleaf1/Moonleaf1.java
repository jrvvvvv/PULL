        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moonleaf1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class Moonleaf1 {
    

    /**
     * @param args the command line arguments
     */
    
    public static Connection ConnecrDb(){
         try {
           Class.forName("oracle.jdbc.OracleDriver");
           Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234"); 
           return con;
       } catch (ClassNotFoundException ex) {   
         
        } catch (SQLException ex) {
          
        }
         return null;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    
         
         
    }

}
