/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fons;

import controlador.Controlador;
import model.Model;
import vista.Vista;

/**
 *
 * @author manel
 */
public class App {
    
    private static Model m = new Model(0);
    private static Vista v = new Vista();
    private static Controlador c;
    
    public static void main(String[] args){
        
        c = new Controlador(m,v);
        
    }
}
