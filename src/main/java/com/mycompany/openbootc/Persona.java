
package com.mycompany.openbootc;

/*

 */
public class Persona {
    private int edad;
    private String nombre;
    private int telefono;
 
    
   public Persona(int edad,String nombre,int telefono){
   this.edad= edad;
   this.nombre=nombre;
   this.telefono=telefono;
   } 
 public void SetEdad(int edad)   
    {this.edad=edad;}
       
public int GetEdad(){
  return edad;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
