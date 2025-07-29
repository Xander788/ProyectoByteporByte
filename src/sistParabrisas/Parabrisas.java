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
public abstract class Parabrisas {
   private EnumParabrisas actividadParabrisas;

    public EnumParabrisas isActividadParabrisas() {
        return actividadParabrisas;
    }
    //Necesario para poder usar el enum
    public void setActividadParabrisas(EnumParabrisas actividadParabrisas) {       
        this.actividadParabrisas = actividadParabrisas;
    }
    //constructor
    public Parabrisas() {
        this.actividadParabrisas = EnumParabrisas.APAGADO;
    }
}
