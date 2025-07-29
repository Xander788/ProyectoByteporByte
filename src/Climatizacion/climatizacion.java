/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Climatizacion;

import Interfaces.Encender;
import Climatizacion.Velocidad;
import Climatizacion.AC_Calefaccion;
/**
 *
 * @author oscar
 */
public class climatizacion implements Encender{
    private Velocidad velocidad;
    private AC_Calefaccion estado;
    private int temperatura = 0;
    private boolean encendido;
    
    public boolean isEncendido(){
        return encendido;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public void setVelocidad(Velocidad velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void encender() {
        this.encendido=true;  
    }

    @Override
    public void apagar() {
        this.encendido=false;   
    }

    public climatizacion(Velocidad velocidad, AC_Calefaccion estado, boolean encendido) {
        this.velocidad = velocidad;
        this.estado = estado;
        this.encendido = encendido;
    }
    
    
}
