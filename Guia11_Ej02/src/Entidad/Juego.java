/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Juego {
    
    Scanner leer = new Scanner(System.in);
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver r1;
    private Jugador j1;
    UTILIDAD u1 = new UTILIDAD();
    
    
    public void llenarJuego(Revolver r1){
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cantJugadores = leer.nextInt();
        for (int i = 0 ; i < cantJugadores; i++){
         Jugador j1 = new Jugador();
        System.out.println("Ingrese su ID (1-6) ");
        int id = leer.nextInt();
        j1.setId(id);
            if (id > 6) {
                j1.setId(id-1);
            }
            
            System.out.println("Ingrese el nombre del jugador: ");
            j1.setNombre(leer.next());
            
            jugadores.add(j1);
        }
        
    }
    
    public void ronda(Revolver r1, Jugador j1){
        boolean aux = false;
        
        do {
         
            for (int i = 0 ; i < jugadores.size(); i++){
                System.out.println("Turno del jugador " + jugadores.get(i).getNombre()  + ":" );
                System.out.println("Disparando: ");
                u1.esperar(1);
                System.out.println("3...");
                u1.esperar(1);
                System.out.println("2...");
                u1.esperar(1);
                System.out.println("1...");
                u1.esperar(1);
                aux = jugadores.get(i).disparo(r1);
                u1.esperar(1);
                
                if (aux == true) {
                    u1.esperar(1);
                    System.out.println( u1.colorRojo() + "El arma disparó... " + jugadores.get(i).getNombre() + " Ha muerto");
                    u1.esperar(1);
                  break;
                }else{
                    u1.esperar(1);
                    System.out.println(u1.colorVerde() + "No disparó el arma...");
                    u1.esperar(1);
                                    }
            }
            
        }while (aux == false);
        
            System.out.println(u1.colorRojo() + "El juego se ha terminado");
    }
}
