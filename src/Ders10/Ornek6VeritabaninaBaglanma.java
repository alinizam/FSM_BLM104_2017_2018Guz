/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek6VeritabaninaBaglanma {
    public static void main(String[] args) {
        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", 
                                                       "app", 
                                                       "app");
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("SELECT * FROM personel");
            while (rs.next())
                System.out.println(rs.getInt("personel_id")+" "+
                                   rs.getString("adi")+" "+
                                   rs.getString("soyadi"));
            con.close();
            System.out.println("Ba?ar?l? ba?lant?");
            
        } catch (SQLException ex) {
            Logger.getLogger(Ornek6VeritabaninaBaglanma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
