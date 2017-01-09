/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Model;
import vista.Vista;

/**
 *
 * @author manel
 */
public class Controlador {
    private Model m;
    private Vista v;

    public Controlador(Model m, Vista v) {
        this.m = m;
        this.v = v;
        this.v.setVisible(true);
        this.v.getjTextField1().setText("0.00");
        
        control(m,v);
    }

    private void control(Model m, Vista v) {
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                m.setMoneda(Double.valueOf(v.getjTextField1().getText().trim()));
                v.getjLabel1().setText("= "+ m.conversor(v.getjRadioButton1().isSelected()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error, no és possible la conversió: "+ex.getMessage());
            }
        }
        
    };
    }
    
    
}
