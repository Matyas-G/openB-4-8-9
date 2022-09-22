
package com.mycompany.openbootc;

/**
 *
 * @author matya
 */
public class trabajador extends Persona {
    
    private int salario;
    
    public trabajador(int edad ,String nombre, int telefono,int salario){
        super(edad, nombre,telefono);
        this.salario=salario;
        
    }
 
    public void mostrardatosTrabajador(){
        System.out.println("nombre:"+getNombre()+"\nEdad:"+GetEdad()+"\ntelefono:"+getTelefono()+"\nSalario:"+salario);}
    
}
