/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EntidadServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Perro> perros = new ArrayList();
    private List<String> nombrePerro = new ArrayList();
    private List<Persona> personas = new ArrayList();

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
            nombrePerro.add(nombreAux);

            System.out.println("Raza: ");
            p1.setRaza(leer.next());

            System.out.println("Edad:");
            p1.setEdad(leer.nextInt());

            System.out.println("Tamaño: (Chico - Mediano - Grande - Gigante)");
            p1.setTamano(leer.next());

            perros.add(p1);

        }

        // System.out.println(perros);
    }

    public void adopcion() {
        boolean bandera = true;

        Iterator<String> it = nombrePerro.iterator();
        System.out.println("Esta es la lista de perros para adoptar: ");
        System.out.println(perros);

        while (it.hasNext()) {
            for (Persona ps : personas) {
                System.out.println("Es el turno de " + ps.getNombre() + " para adoptar: "
                        + "\nIntroduce el nombre del perro que desea adoptar: ");
                String perroAux = leer.next();

                String aux = it.next();
                if (perroAux.equalsIgnoreCase(aux)) {
                    System.out.println("Felicidades, adoptaste un perrito! ");
                    it.remove();
                    bandera = true;
                } else {
                    bandera = false;
                }
            }

        }
        if (!bandera) {
            System.out.println("Ese perro no se encuentra en la lista");
        }
    }
}

//        System.out.println("Esta es la lista de perros:");
//        System.out.println(perros);
//        
//        for(Persona persona : personas){
//        System.out.println( persona.getNombre() + " es tu turno de adoptar: " );
//        
//        for(Perro perro :perros){
//            
//            System.out.println("Ingrese el nombre del perro que desea adoptar: ");
//            String perroAux = leer.next();
//            
//            if (perro.getNombre().equalsIgnoreCase(perroAux)) {
//                System.out.println("Felicidades, adoptaste al perro " + perro.getNombre());
//                perros.remove(perro);
//            }else{
//                System.out.println("Ese perro no está en la lista boludo");
//            }
//            
//            if (perros.isEmpty()) {
//                break;
//                
//            }
//            
//        }
//        }
//    }
//
//}
