/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAlarmaBloqueo;

/**
 *
 * @author Braya
 */
public class Bloqueo {
     private boolean bloqueado;

    public boolean isBloqueado() {
        return bloqueado;
    }

    public Bloqueo() {
        this.bloqueado = false;
    }
    
    public void bloquear() {
        this.bloqueado = true;
    }

    public void desbloquear() {
        this.bloqueado = false;
    }
    
}
