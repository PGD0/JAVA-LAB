/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class ConexionBD {
    Connection cn;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/laboratorio_final","root","");
            System.out.println("Conexion establecida...");
        }catch(Exception e) {
            System.err.println("No se pudo establecer conexion con la Base de Datos");
            System.out.println(e.getMessage());
        }
        return cn;
    }
}
