/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAlarmaBloqueo;

import Interfaces.Encender;

/**
 *
 * @author Braya
 */
public class Alarma implements Encender{
    private boolean alarmaEncendida;

    public boolean isAlarmaEncendida() {
        return alarmaEncendida;
    }

    public Alarma() {
        this.alarmaEncendida = false;
    }
  
    @Override
    public void encender() {
        if(!this.alarmaEncendida){
            this.alarmaEncendida=true;
        }
    }

    @Override
    public void apagar() {
       if(this.alarmaEncendida){
           this.alarmaEncendida=false;
       }
    } 
}
