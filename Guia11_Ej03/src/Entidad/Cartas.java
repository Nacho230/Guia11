/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nacho
 * 
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
public class Cartas {
    
    private String numero; 
    private Palos palo;

    public Cartas() {
    }

    public Cartas(String numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palos getP1() {
        return palo;
    }

    public void setP1(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", p1=" + palo + '}';
    }

    
    

    
    
}
