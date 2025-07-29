/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaControlPuertas;

import SistemaAlarmaBloqueo.Alarma;
import SistemaAlarmaBloqueo.Bloqueo;
import sistIluminacion.newpackage.Luces;

/**
 *
 * @author Braya
 */
public class ControlPuertas extends Luces {
    private boolean abierta;
    private Alarma alarma;
    private Bloqueo bloqueo;

    public boolean isAbierta() {
        return abierta;
    }

    public boolean isAlarmaActiva() {
        return alarma.isAlarmaEncendida(); // método auxiliar para GUI
    }

    public boolean isBloqueada() {
        return bloqueo.isBloqueado();
    }
    
    public ControlPuertas(Alarma alarma, Bloqueo bloqueo) {
        this.abierta = false;
        this.alarma = alarma;
        this.bloqueo = bloqueo;
    }
    
    public void abrir() {
        if (this.bloqueo.isBloqueado()) {
            this.alarma.encender();  // No abre, solo enciende la alarma
            return;
        }if (!this.abierta) {
            this.abierta = true;
            this.encender();  // enciende la luz
        }
    }
    
    public void cerrar() {
        if(this.abierta){
            this.abierta=false;
            this.apagar();
            alarma.apagar();
        }
    }
}
