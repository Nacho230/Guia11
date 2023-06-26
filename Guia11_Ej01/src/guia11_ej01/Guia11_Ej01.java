/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_ej01;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.EntidadServicio;

/**
 *
 * @author nacho
 */
public class Guia11_Ej01 {

    /**
     * @param args the command line arguments
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntidadServicio ev = new EntidadServicio();
        Perro p1 = new Perro();
        Persona ps = new Persona();

        ev.initPersona();
        ev.initPerro();
        ev.adopcion();

    }

}
