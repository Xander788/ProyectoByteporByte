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
     private boolean encendido; // Estado del sistema (true = encendido, false = apagado)

    // Método que devuelve el estado actual del sistema
    public boolean isEncendido() {
        return encendido;
    }

    // Constructor: inicializa el sistema como apagado
    public Motor() {
        this.encendido = false; // inicia apagado
    }
    
    @Override
    public void encender() {
        if(!this.encendido){
            this.encendido=true;
        }
    }
        
    @Override
    public void apagar() {
       this.encendido=false;
    } 
}
