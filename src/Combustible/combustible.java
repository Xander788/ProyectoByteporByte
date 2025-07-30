/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Combustible;

/**
 *
 * @author oscar
 */
public class Combustible {
    private double nivel;

    public double getNivel() {
        return nivel;
    }

    public Combustible() {
        this.nivel = 100.0;
    }
    
    public void rellenarCombustible(){
        this.nivel=100;
    }
    
    public void consumir() {
        if (nivel >= 0.35) {
            nivel -= 0.35;
        } else {
            nivel = 0;
        }
    }
}
