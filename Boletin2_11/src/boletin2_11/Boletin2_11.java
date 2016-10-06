/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float stotal,sfijo,comision,kilometros,diasdesplazado,kilometraje,dietas,ventas;
        
        sfijo = Float.parseFloat(JOptionPane.showInputDialog("sfijo"));
        ventas = Float.parseFloat(JOptionPane.showInputDialog("ventas"));
        kilometros = Float.parseFloat(JOptionPane.showInputDialog("kilometros"));
        diasdesplazado = Float.parseFloat(JOptionPane.showInputDialog("diasdesplazado"));
        
        comision = ((ventas*5)/100);
        kilometraje = (kilometros*2);
        dietas = (30*diasdesplazado);
        
        
        
        stotal = (sfijo+comision+kilometraje+dietas);
        
        System.out.print(stotal);
    }
    
}
