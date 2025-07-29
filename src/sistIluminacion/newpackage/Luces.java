/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistIluminacion.newpackage;
import Interfaces.Encender;

/**
 *
 * @author Gloriana
 */
public abstract class Luces implements Encender{
    //se establece una variable de control utilizable en todas las luces del auto
    private boolean luz;

    public boolean isluz() {
        return luz;
    }
    //constructor
    public Luces() {
        this.luz = false;
    }
    //importado de interfases
    public void encender(){
       this.luz = true; 
    }
    public void apagar(){
       this.luz = false; 
    }
}
