/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author nacho
 * 
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
public class Revolver {
 
    private double posicion_tambor; //es la posición actual del tambor
    private double posicion_agua; // es la posicion del tambor donde se encuentra el agua

    Scanner leer = new Scanner(System.in);

    public Revolver() {
    }

    public Revolver(double posicion_tambor, double posicion_agua) {
        this.posicion_tambor = posicion_tambor;
        this.posicion_agua = posicion_agua;
    }

    public double getPosicion_tambor() {
        return posicion_tambor;
    }

    public void setPosicion_tambor(double posicion_tambor) {
        this.posicion_tambor = posicion_tambor;
    }

    public double getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(double posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion_tambor=" + posicion_tambor + ", posicion_agua=" + posicion_agua + '}';
    }

    public void llenarRevolver() {
        
        double aux = Math.random() * 5 + 1;
        aux = Math.round(aux);
        
        double aux1 = Math.random() * 5 + 1;
        aux1 = Math.round(aux1);
        
        this.setPosicion_tambor(aux);
        //System.out.println(aux + "TAMBOR");
        this.setPosicion_agua(aux1);
        //System.out.println(aux1 + "AGUA");
    }

    public boolean Mojar() {
        
        if (this.getPosicion_tambor() == this.getPosicion_agua()) {
            return true;
        } else {
            siguienteChorro();
            return false;
        }
        
    }

    public void siguienteChorro() {
        if (this.getPosicion_tambor() == 6) {
            this.setPosicion_tambor(1);
        } else {
            this.setPosicion_tambor(this.getPosicion_tambor() + 1);
        }
    }

}
