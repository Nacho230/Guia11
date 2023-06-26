/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EntidadServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Perro> perros = new ArrayList();
    private HashMap<String, Perro> nombrePerro = new HashMap();
    private List<Persona> personas = new ArrayList();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombrePerro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntidadServicio other = (EntidadServicio) obj;
        if (!Objects.equals(this.nombrePerro, other.nombrePerro)) {
            return false;
        }
        return true;
    }

    
    public void initPersona() {

        for (int i = 0; i < 2; i++) {
            Persona ps = new Persona();

            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.println("Nombre:");
            ps.setNombre(leer.next());

            System.out.println("Apellido: ");
            ps.setApellido(leer.next());

            System.out.println("Edad: ");
            ps.setEdad(leer.nextInt());

            System.out.println("Dni:");
            ps.setDni(leer.next());

            personas.add(ps);
        }
        // System.out.println(personas);

    }

    public void initPerro() {

        for (int i = 0; i < 2; i++) {

            Perro p1 = new Perro();
            System.out.println("Ingrese los datos de la mascota " + (i + 1) + ":");
            System.out.println("Nombre: ");
            String nombreAux = leer.next();
            p1.setNombre(nombreAux);
            

            System.out.println("Raza: ");
            p1.setRaza(leer.next());

            System.out.println("Edad:");
            p1.setEdad(leer.nextInt());

            System.out.println("Tamaño: (Chico - Mediano - Grande - Gigante)");
            p1.setTamano(leer.next());

            nombrePerro.put(nombreAux, p1);

        }

    }

    public void adopcion() {
        boolean bandera = true;
        int aux = 0;

        System.out.println("Esta es la lista de perros para adoptar: ");
        
         for (Map.Entry<String, Perro> index : nombrePerro.entrySet()) {
            String key = index.getKey();
            Perro value = index.getValue();
            
             System.out.println(index);
        }
         System.out.println("");
        
            for (int i = 0 ; i < personas.size(); i++) {
                System.out.println("Es el turno de " + personas.get(i).getNombre() + " para adoptar: "
                        + "\nIntroduce el nombre del perro que desea adoptar: ");
                String perroAux = leer.next();
                //String aux = it.next();
                if (nombrePerro.containsKey(perroAux)) {
                    System.out.println("Felicidades, adoptaste un perrito! ");
                    Perro aux01 = nombrePerro.get(perroAux);
                    personas.get(i).setPerro(aux01);
                    nombrePerro.remove(perroAux);
                    aux++;
                    bandera = true;
                } else {
                    
                    bandera = false;
                }
                System.out.println("Lista de perros que quedan: ");
                System.out.println(nombrePerro);
            }
            
            
        
        if (!bandera) {
            System.out.println("Ese perro no se encuentra en la lista");
        }
    }
    
    public void mostrarAdoptados(){
        System.out.println("LISTA DE PERSONAS CON SU PERRO: ");
                System.out.println(personas);
    }
    
    
}

