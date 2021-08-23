/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristhofer
 */
public class Conectar {
    private String driver="com.mysql.jdbc.driver";
    private String cadenaconection="jdbc://127.0.0.1/TareaFinal";
    private String usuario="root";
    private String contraseña="";
    public Connection con;
    
    public Conectar(){
        try{
          Class.forName(driver);
        con=DriverManager.getConnection(cadenaconection,usuario,contraseña); 
           JOptionPane.showMessageDialog(null,"Conectado con la BD"); 
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer una coneccion con la BD"+e.getMessage());
        }
    }

    public void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
