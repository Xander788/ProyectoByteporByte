/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SensoresReversa;

import Interfaces.Encender;

/**
 *
 * @author alexr
 */
public class SensorReversa  implements Encender{
    private boolean alarma;

    public boolean isAlarma() {
        return alarma;
    }

    public void encender(boolean alarma) {
        if(!this.alarma){
            this.alarma=true;
        }
    }

    public void apagar(boolean alarma) {
        this.alarma=false;
    }

    @Override
    public void encender() {
        if(!this.alarma){
            this.alarma=true;
        }
    }

    @Override
    public void apagar() {
        this.alarma=false;
    }

   
    
    
}
