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
public class Mesa {
    private Carta[] cartas = new Carta[5];
    private int cantidad = 0;

    public Mesa(int cantidad) {
        this.cantidad = cantidad;
    }

    public Mesa() {
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta cartas) {
        this.cartas[cantidad++] = cartas;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void limpiar(){
        cartas = new Carta[5];
        cantidad = 0;
    }
    
    
    
}
