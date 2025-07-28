/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistParabrisas;
import Interfaces.Encender;

/**
 *
 * @author Gloriana
 */
public abstract class Parabrisas implements Encender {
   private boolean parabrisas;

    public boolean isParabrisas() {
        return parabrisas;
    }
    //Necesario para poder usar el enum
    public void setParabrisas(boolean parabrisas) {
        this.parabrisas = parabrisas;
    }
    //constructor
    public Parabrisas(boolean parabrisas) {
        this.parabrisas = false;
    }
    public void encender(boolean parabrisas){
    this.parabrisas = true;
    } 
    public void apagar(boolean parabrisas){
    this.parabrisas = false;
    } 
}
