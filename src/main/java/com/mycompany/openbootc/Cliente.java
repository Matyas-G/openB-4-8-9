
package com.mycompany.openbootc;

/**
 *
 * @author matya
 */
public class Cliente extends Persona {
      
    private int credito;
    
    public Cliente(int edad ,String nombre, int telefono,int credito){
        super(edad, nombre,telefono);
        this.credito=credito;
        
    }
 
    public void mostrardatos(){
        System.out.println("nombre:"+getNombre()+"\nEdad:"+GetEdad()+"\ntelefono:"+getTelefono()+"\ncredito:"+credito);}
}

