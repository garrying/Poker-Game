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
public class Player {
    Carta [] cartas = new Carta[2];
    int cantidad;
    String nombre;

    public Player(String nombre) {
        this.nombre = nombre;
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void vaciar() {
        cartas = new Carta[2];
        cantidad = 0;
    }
    
    
}
