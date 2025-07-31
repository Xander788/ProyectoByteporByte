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
    private double frecuencia;
    private boolean bluetooth;
    private double paso;
    
    public boolean blueetoothEncendido(){
        return false;
    }
    
    public boolean isEncendido(){
        return encendido;
    }

    public double getPaso() {
        return paso;
    }

    public RadioModo getModo() {
        return modo;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    
    public void setModo() {
        this.modo = modo;
    }
    public double cambiarFrecuencia(RadioModo modo){
        if(modo == modo.AM){
            this.frecuencia = 530.0;
        }else{
            if(modo == modo.FM){
                this.frecuencia = 87.5;
            }
        }
        return frecuencia;
    }

    @Override
    public void encender() {
        this.encendido=true;
    }

    @Override
    public void apagar() {
        this.encendido=false;
    }  

    public radio() {
        this.encendido = false;
        this.modo = modo.AM;
        this.bluetooth = false;
        this.frecuencia = 0.0;
        this.paso=0.0;
    } 
}
