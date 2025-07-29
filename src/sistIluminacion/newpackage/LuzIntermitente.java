/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistIluminacion.newpackage;

/**
 *
 * @author Gloriana
 */
public abstract class LuzIntermitente extends Luces {
//volatible se usa para que los hilos esten atentos al valor de este boleano ya que sera de control
    private volatile boolean luzIntermitente;
    
    //porque?

    public LuzIntermitente(boolean luzIntermitente) {
        this.luzIntermitente = luzIntermitente;
    }

    public boolean isLuzIntermitente() {
        return luzIntermitente;
    }
    public void Luz_intermitente() {
        this.luzIntermitente = false;
}
    @Override
    public void encender(){
    this.luzIntermitente = true;
}   
    public void apagar(){
    this.luzIntermitente = true;
} 
    public void funcionIntermitente(){
        while(true){
            if (!luzIntermitente){ 
                try{
                    Thread.sleep(5000);
                    
                    if(luzIntermitente = false){
                        
                     break;  
                     
                    }}catch(InterruptedException e){
                    Thread.currentThread().interrupt();// interrumpe el hilo y lo restaura para volver a usarlo
                    
                    luzIntermitente = false; 
                }  
            } 
        } 
    }
}