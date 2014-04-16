/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.poker.game;

/**
 *
 * @author Sail3
 */
public class Carta {
    String nombre;
    String palo;
    int numero;

    public Carta() {
    }

    
    public Carta(String nombre, String palo, int numero) {
        this.nombre = nombre;
        this.palo = palo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
