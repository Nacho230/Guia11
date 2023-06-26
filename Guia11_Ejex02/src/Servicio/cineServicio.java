package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Collections;
import utilidad.UTILIDAD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
public class cineServicio {
    ArrayList<Pelicula> listaPelicula = new ArrayList();
    ArrayList<Espectador> gente = new ArrayList();
    
    Pelicula p1 = new Pelicula();
    Cine c1 = new Cine();
    Sala s1 = new Sala();
    UTILIDAD u1 = new UTILIDAD();
    
    
    public void init(){
        
         int aux = 0;
        String letras[] = {"A", "B", "C","D", "E", "F"};
        String personas [] = {"Julio", "Nacho", "Ignacio","Martin", "Richard", "Cristian","Fernando", "Manuel", "Gabriel","Joaquin", "Ezequiel", "Julieta"};
        
        listaPelicula.add(new Pelicula ("Rapidos y furiosos 8", 2, 18, "Richard Cuevas"));
        listaPelicula.add(new Pelicula ("Transformers 5", 1.30, 14, "Elsa Capunta"));
        listaPelicula.add(new Pelicula ("Avengers 2", 2.30, 14, "Ignacio "));
        listaPelicula.add(new Pelicula ("Los guardianes de la galaxia 3", 2, 16, "Martin Selis "));
        listaPelicula.add(new Pelicula ("Hulk ", 3, 18, "Fulanito"));
        
        Collections.shuffle(listaPelicula);
        
         c1.setPrecio(Math.round(Math.random()*2500));
  
        System.out.println("El precio de la entrada es: " + c1.getPrecio());

        for (int i = 0; i < 48; i++) {
            gente.add(new Espectador(personas[ (int) (Math.random() * personas.length)], (int) (Math.random() * 50 + 10), (int) (Math.random()*3000 + 500)));
        }
        
        c1.setEspectador(gente);
        
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                
                c1.getAsiento()[i][j] = new Sala((i+1), letras[j], false);
                
               //System.out.print(c1.getAsiento()[i][j] + "|" + "");
            }
        }
      
        System.out.println("La pelicula que se va a ver es: " + listaPelicula.get(0).getTitulo());
        c1.setPelicula(listaPelicula.get(0));
        
        
        
         //String[][]  auxMatrix = new String[8][6];

         
        for (int i = 0; i < c1.getEspectador().size(); i++) {
            
            Sala s1 = c1.getAsiento() [ (int) (Math.random()*8)][ (int) (Math.random()*6)];
           
            Espectador e1 = c1.getEspectador().get(i);
            
            if (e1.getEdad() >= c1.getPelicula().getEdadMinima() && e1.getDineroDisponible() >= c1.getPrecio() && s1.isOcupado() == false) {
                s1.setOcupado(true);
                
                aux++;
                
                
            }else if(e1.getEdad() >= c1.getPelicula().getEdadMinima() && e1.getDineroDisponible() >= c1.getPrecio() && s1.isOcupado()){
                i--;
            }else{
                
            }
            
        }
        
        System.out.println("La cantidad de espectadores son: " + aux);
        
        System.out.println(" ");
 for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                
                    System.out.print(u1.colorNegro()+ c1.getAsiento()[i][j] + u1.colorNegro() + "|" + " ");
                    if (s1.getNumero() == 0 && s1.getLetra() == "") {
                    c1.getAsiento()[i][j] =  new Sala((i+1), letras[j], false);
                } else {
                    c1.getAsiento()[i][j] = new Sala((i+1), letras[j], true);
            }
            
        }
        System.out.println("");
    }
    }
}
    

