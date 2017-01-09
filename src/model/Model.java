/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author manel
 */
public class Model {
    
    private final double VALOR = 0.86;
    
    private double moneda;

    public Model(double moneda) {
        this.moneda = moneda;
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }
    
 public double conversor(boolean isSelected){
     if(isSelected) {
         return moneda * VALOR;
     }
     return moneda / VALOR;
 }    
}
