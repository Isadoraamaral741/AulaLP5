/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u07773981175
 */
public class Util {
    public static void habilitar(JComponent ... compontentes){
         for (int i = 0; i < compontentes.length; i++) {
            compontentes[i].setEnabled(true);
            
        }
    }
      public static void desabilitar(JComponent ... compontentes){
         for (int i = 0; i < compontentes.length; i++) {
            compontentes[i].setEnabled(false);
            
        }
    }
}
