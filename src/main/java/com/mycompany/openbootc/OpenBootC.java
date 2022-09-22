
package com.mycompany.openbootc;



import java.util.Scanner;

//                 EJERCICIOS --------TEMA 4----------


//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
/*public class OpenBootC {
    public static void main(String[] args) {
        int num = 0;
        if (num==0 ){System.out.println("el numero es cero");
        if(num>=0){ System.out.println("el numero es positivo");}}*/

/*
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile 
sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

public class OpenBootC {
    public static void main(String[] args) {
        int numeroWhile=1;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;}}}*/



//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
/*public class OpenBootC {
    public static void main(String[] args) {
      int numeroWhile=0;
      do{
          System.out.println(numeroWhile);
                  numeroWhile++;
          }while (numeroWhile<1);}}*/


/*Para el bucle For, crea una variable numeroFor, esta variable tendrá 
como valor 0 y su condición será que la variable sea igual o menor que 3,
se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.*/
/*public class OpenBootC {
    public static void main(String[] args) {
       int numeroFor;
       for(numeroFor=0 ;numeroFor<=3;numeroFor++){
           System.out.println(numeroFor);}}}*/


/*Por último, para el Switch, deberás crear la variable estacion, y distintos case 
para las cuatro estaciones del año. 
Dependiendo del valor de la variable estacion se deberá mandar un mensaje por 
consola informando de la estación en la que está. También habrá que poner un default 
para cuando el valor de la variable no sea una estación*/
/*public class OpenBootC {
    public static void main(String[] args){
        int estacion=2;
        switch(estacion){
           case 1: System.out.println("verano");   
           break; 
           case 2: System.out.println("otoño");   
           break; 
           case 3: System.out.println("invierno");   
           break; 
           case 4: System.out.println("primavera");   
           break; 
           default: System.out.println("dato incorrecto");}}}*/


//EJERCICIO ---- TEMA 8------


/*Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, 
nombre y telefono, por último muéstralas por consola.*/

/*public class OpenBootC {
    public static void main(String[] args){
    Persona persona = new Persona();
        persona.SetEdad(20);
        System.out.println("la edad es "+persona.GetEdad());
        persona.setNombre("Matias");
        System.out.println("el nombre es "+persona.getNombre());
        persona.setTelefono(1157507192);
        System.out.println("el telefono es "+persona.getTelefono());}}*/



//EJERCICIO --------TEMA 9--------


public class OpenBootC {
    public static void main(String[] args){
        System.out.println("datos del cliente");
        Cliente cliente= new Cliente(35,"matias",2664899,50);
      
        cliente.mostrardatos();
        System.out.println("datos del trabajador");
        trabajador trabajador = new trabajador(30,"raul",1555544,700);
        
        trabajador.mostrardatosTrabajador();
    }}