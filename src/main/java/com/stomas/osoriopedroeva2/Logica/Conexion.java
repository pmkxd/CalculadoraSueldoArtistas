/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.osoriopedroeva2.Logica;

import com.stomas.osoriopedroeva2.Exceptions.ArtistaException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author parag
 */
public class Conexion {
    private final String url= "jdbc:mysql://localhost:3306/netbeans";
    private final String user= "root";
    private final String password="";
    private final String driver= "com.mysql.cj.jdbc.Driver";
    Connection con;
    
    public void conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Se conecto a la base de datos");
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se conecto a la base de datos");
        }
    }
    public void agregarArtista(Artista artista) throws ArtistaException{
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            String sql = "INSERT INTO ARTISTAS(NOMBRE,GENERO,CANT_CANCIONES,CANT_REPRODUCCIONES,TOTAL_PAGO,APLICA_BONO) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,artista.getNombre());
            ps.setString(2,artista.getGenero());
            ps.setInt(3,artista.getCant_canciones());
            ps.setInt(4,artista.getCant_reproducciones());
            ps.setInt(5,artista.getTotal_pago());
            ps.setString(6, artista.getAplica_bono());
            ps.executeUpdate(); 
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Artista> obtenerTodosLosArtistas(){
        ArrayList<Artista> artistas = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(url, user, password)){
            String sql = "SELECT * FROM ARTISTAS";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Artista artista = new Artista(
                        rs.getString("nombre"),
                        rs.getString("genero"),
                        rs.getInt("cant_canciones"),
                        rs.getInt("cant_reproducciones"),
                        rs.getInt("total_pago"),
                        rs.getString("aplica_bono")
                );
                artistas.add(artista);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return artistas;
    }
}
