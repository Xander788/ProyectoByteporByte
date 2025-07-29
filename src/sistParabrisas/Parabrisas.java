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
   private boolean actividadParabrisas;
   private String velocidadParabrisas;

    public boolean isActividadParabrisas() {
        return actividadParabrisas;
    }

    public String getVelocidadParabrisas() {
        return velocidadParabrisas;
    }
    //Necesario para poder usar el enum
    public void setVelocidadParabrisas(String velocidadParabrisas) {
        this.velocidadParabrisas = velocidadParabrisas;
    }    
    //constructor
    public Parabrisas(boolean actividadParabrisas, String velocidadParabrisas) {
        this.actividadParabrisas = false;
        this.velocidadParabrisas = "MIN";
    }
    
    public void encender(boolean actividadParabrisas){
    this.actividadParabrisas = true;
    } 
    public void apagar(boolean actividadParabrisas){
    this.actividadParabrisas = false;
    } 
}
