/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Radio;


/**
 *
 * @author oscar
 */
public enum RadioModo{
    AM("AM"),
    FM("FM"),
    BLUETOOTH("Bluetooth");
    
    private final String modo;

    private RadioModo(String modo) {
        this.modo = modo;
    }

    public String getModo() {
        return modo;
    }
    
}
