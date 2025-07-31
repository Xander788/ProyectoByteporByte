/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Climatizacion;


public enum AC_Calefaccion {
    AC("Aire Acondicionado"),
    CALEFACCION("Calefaccion"),
    APAGADO("Apagado");
    
    private final String estado;
    

    private AC_Calefaccion(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    public String toString(){
        return estado;
    }
       
    
}
