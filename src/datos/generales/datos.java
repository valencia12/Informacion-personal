/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.generales;

/**
 *
 * @author Jorge
 */
public class datos {
 /**
 Declaracion de variables
 */
   String nombre,apellido,sexo;
   double peso;
   double estatura;
   int  edad;
 /**
 Creacion del constructor
 */
   
public datos(String nombre, String apellido, String sexo, int edad, double estatura, int peso){
    this.nombre = nombre;  
    this.apellido = apellido;
    this.sexo = sexo;
    this.edad = edad;
    this.estatura = estatura;
    this.peso = peso;
}

public void infoGeneral(){
    System.out.println("Nombre: " + nombre );
    System.out.println("Apellido: " + apellido );
    System.out.println("Sexo: " + sexo);
}
public void infoPersonal(){
    System.out.println("Edad: " + edad + " A;os" );
    System.out.println("Estatura: " + estatura + " CM.");
    System.out.println("Peso: " + peso + " kg." );
}
}

