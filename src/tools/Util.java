/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.TextField;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u07773981175
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... compontentes){
         for (int i = 0; i < compontentes.length; i++) {
            compontentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... components){
        for (int i = 0; i < components.length; i++) {
            // instanceof
             ((JTextField) components[i]).setText("");
            
        }
    }
    
     
}
