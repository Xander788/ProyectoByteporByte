/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaControlCinturones;

/**
 *
 * @author Braya
 */
public class ControlCinturon {
    private boolean colocado;

    public boolean isColocado() {
        return colocado;
    }

    public ControlCinturon() {
        this.colocado = false;
    }
    
    public void colocar() {
       if(!this.colocado){
           this.colocado = true;
       }
    }
    
    public void quitar() {
        if(this.colocado){
            this.colocado=false;
        }
    }
}
