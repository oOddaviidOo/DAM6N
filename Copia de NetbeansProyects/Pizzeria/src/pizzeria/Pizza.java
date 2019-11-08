/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author DAM 6N
 */
public class Pizza {
    private String tamaño;
    private String masa;
    private String ingredientes;

    public Pizza(String tamaño, String masa, String ingredientes) {
        this.tamaño = tamaño;
        this.masa = masa;
        this.ingredientes = ingredientes;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getMasa() {
        return masa;
    }
    public void setMasa(String masa) {
        this.masa = masa;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    
    
    
}
