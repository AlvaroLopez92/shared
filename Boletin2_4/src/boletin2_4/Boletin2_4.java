/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author alopezcobo
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float numero1,numero2,res1,res2,res3,res4;
        
        
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("numero1"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("numero2"));
        
        res1 = numero1+numero2;
        res2 = numero1-numero2;
        res3 = numero1*numero2;
        res4 = numero1/numero2;
        
        System.out.print(res1);
        System.out.print(res2);
        System.out.print(res3);
        System.out.print(res4);
        
        
    }
    
}
