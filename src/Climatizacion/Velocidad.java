/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Climatizacion;

/**
 *
 * @author oscar
 */
public enum Velocidad {
    RAPIDO("Rapido"),
    MEDIO("medio"),
    lento("lento");
    
    private final String velocidad;

    private Velocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }
    
}
