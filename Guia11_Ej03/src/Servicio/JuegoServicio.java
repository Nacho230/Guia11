/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cartas;
import Entidad.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class JuegoServicio {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Palos> palo = new ArrayList();
    private ArrayList<Cartas> carta = new ArrayList();
    private ArrayList<Cartas> cartaDada = new ArrayList();
    UTILIDAD u1 = new UTILIDAD();

    public JuegoServicio() {
    }

    public void crearPalos() {

        palo.add(new Palos("Espada"));
        palo.add(new Palos("Basto"));
        palo.add(new Palos("Oro"));
        palo.add(new Palos("Copa"));
    }

    public void crearBaraja() {
        crearPalos();
        if (carta.size() > 0) {
            System.out.println("Ya está en el mazo, titán ");
        } else {
            System.out.println("Creando baraja...");
                    u1.esperar(1);
                    System.out.println("3...");
                    u1.esperar(1);
                    System.out.println("2...");
                    u1.esperar(1);
                    System.out.println("1...");
                    u1.esperar(1);
                    
            
        }

        String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

        for (int i = 0; i < palo.size(); i++) {
            for (int j = 0; j < numero.length; j++) {
                carta.add(new Cartas(numero[j], palo.get(i)));
            }
        }

        System.out.println("La baraja ya se puede utilizar ");

    }

    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        System.out.println("Se estan barajando las cartas...");
              u1.esperar(1);
                    System.out.println("3...");
                    u1.esperar(1);
                    System.out.println("2...");
                    u1.esperar(1);
                    System.out.println("1...");
                    u1.esperar(1);
                    Collections.shuffle(carta);
                    
        System.out.println("Las cartas se mezclaron");
    }

    //siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public void siguienteCarta() {
        Iterator<Cartas> it = carta.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
            break;
        }
        if (carta.isEmpty()) {
            System.out.println("Se dieron todas las cartas maestro");
        }

    }

    //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles() {

        System.out.println("Las cartas disponibles son: ");
        System.out.println(carta.size());
    }

    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
    public void darCartas() {

        Iterator<Cartas> it = carta.iterator();
        int aux1 = 0;
        System.out.println("Ingrese la cantidad de cartas a dar: ");
        int aux = leer.nextInt();

        if (aux > carta.size()) {
            System.out.println("No te doy nada porque pediste mucho, la proxima ingresa una cantidad inferior, puto");
        } else {

            for (int i = 0; i < aux; i++) {
                System.out.println(carta.get(aux1));
                cartaDada.add(carta.get(aux1));
                aux1++;
            }
            for (int i = 0; i < aux; i++) {
                carta.remove(0);
            }
        }

    }

    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton() {

        if (carta.size() == 40) {
            System.out.println("No se dieron cartas todavia, papucho");
        } else {
            System.out.println(cartaDada);
        }
    }

    public void mostrarBaraja() {
        System.out.println("Las cartas de la baraja son: ");
        for (Cartas cartaAux : carta) {
            System.out.println(cartaAux);
        }

    }

}
   
   
   

