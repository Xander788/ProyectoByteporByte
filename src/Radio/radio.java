/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Radio;

import Interfaces.Encender;

/**
 *
 * @author oscar
 */
public class radio implements Encender{
    private boolean encendido;
    private RadioModo modo;
    private double frecuencia = 87.5;
    
    public boolean isEncendido(){
        return encendido;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public void setModo() {
        this.modo = modo;
    }
    public void cambiarFrecuencia(RadioModo modo, double frecuencia){
     
    }

    @Override
    public void encender() {
        this.encendido=true;
    }

    @Override
    public void apagar() {
        this.encendido=false;
    }  

    public radio(boolean encendido, RadioModo modo) {
        this.encendido = false;
        this.modo = modo;
    }
    
}
