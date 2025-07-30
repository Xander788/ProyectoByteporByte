/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Motor;

import Interfaces.Encender;

/**
 *
 * @author Braya
 */
public class Motor implements Encender{
    private boolean encendido;
    private double velocidad;
    private int rpm;
    private double kilometraje;
    private long tiempoEncendido; 
    private long tiempoInicio;

    public boolean isEncendido() {
        return encendido;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getRpm() {
        return rpm;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    public Motor() {
        this.encendido = false;
        this.velocidad = 0;
        this.rpm = 0;
        this.kilometraje = 0;
        this.tiempoEncendido = 0;
    }
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            tiempoInicio = System.currentTimeMillis();
        }
    }
    
    @Override
    public void apagar() {
        if (encendido) {
            actualizarKilometraje();
            encendido = false;
        }
    }

    private void actualizarKilometraje() {
        long tiempoFinal = System.currentTimeMillis();
        long duracion = tiempoFinal - tiempoInicio;
        tiempoEncendido += duracion;

        double horas = duracion / 3600000.0;
        kilometraje += velocidad * horas;
    }

    public void setVelocidad(double nuevaVelocidad) {
        this.velocidad = nuevaVelocidad;
        this.rpm = calcularRPM(nuevaVelocidad);
    }

    private int calcularRPM(double velocidad) {
        return (int)(velocidad * 100); 
    }
}
