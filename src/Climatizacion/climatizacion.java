/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Climatizacion;

import Interfaces.Encender;

public class climatizacion implements Encender{
    private Velocidad velocidad;
    private AC_Calefaccion estado;
    private int temperatura;
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

    public Velocidad getVelocidad() {
        return velocidad;
    }

    public AC_Calefaccion getEstado() {
        return estado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public climatizacion() {
        this.velocidad = velocidad.lento;
        this.estado = estado.APAGADO;
        this.encendido = false;
        this.temperatura = 0;
    }
    
    
}
