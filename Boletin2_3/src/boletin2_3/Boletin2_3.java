/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3.pkg2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    float euros,cambio,dolares;
    
        euros = Float.parseFloat(JOptionPane.showInputDialog("euros"));
        cambio = Float.parseFloat(JOptionPane.showInputDialog("cambio"));
    
        dolares = euros*cambio;
        
        System.out.print(dolares);
            
    
        // TODO code application logic here
    }
    
}
