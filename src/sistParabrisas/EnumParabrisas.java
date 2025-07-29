/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistParabrisas;

/**
 *
 * @author Gloriana
 */
public enum EnumParabrisas {
    APAGADO("APAGADO"),
    BAJO("VELOCIDAD MINIMA"),
    MEDIO("VELOCIDAD MEDIA"),
    RAPIDO("VELOCIDAD MAXIMA");
    
    private final String velocidad;

    EnumParabrisas(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "EnumParabrisas="+"velocidad:" + velocidad;
    }
}
