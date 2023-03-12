/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboii_2101092022;

import Ulfah.dao.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author ASUS
 */
public class PBOII_2101092022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException{
        // TODO code application logic here
        
        try {
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getKoneksi();
            JOptionPane.showMessageDialog(null, "Koneksi Ok");
        }  catch (SQLException ex) {
            Logger.getLogger(PBOII_2101092022.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error OK");
        }
        
    }
    
}
