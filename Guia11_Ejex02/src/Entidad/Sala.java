/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class Sala {
    
    private int numero;
    private String letra;
    private boolean ocupado;
    UTILIDAD u1 = new UTILIDAD();

    public Sala() {
        this.numero = 0;
        this.letra = "";
        this.ocupado = false;
    }

    public Sala(int numero, String letra, boolean ocupado) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        //(ocupado? "X" : " ")  -->  IF REDUCIDO+ (ocupado? "X" : " ");

        return u1.colorNegro()+ numero + u1.colorNegro() +   letra + (ocupado? (u1.colorRojo()+ "X") : (u1.colorVerde() + " "));
    }
    
    
    
    
    
}
