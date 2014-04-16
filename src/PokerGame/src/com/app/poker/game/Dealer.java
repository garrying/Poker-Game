/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.poker.game;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sail3
 */
public class Dealer {
    Carta[] cartas = Inicializador.getCartas();
    ArrayList<Carta> cartasUsadas = new ArrayList<Carta>();
    ArrayList<Player> jugadores = new ArrayList<Player>();
    Mesa mesa;
    
    public Dealer(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            jugadores.add(new Player("Player0"+i));
        }
        
        mesa = new Mesa();
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Player> jugadores) {
        this.jugadores = jugadores;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public Carta obtenerCarta(){
        Carta carta;
        do {
            int id = (int) (Math.random() * 51);
            carta = cartas[id];
        } while (cartasUsadas.contains(carta) && cartasUsadas.size() <=52);
        cartasUsadas.add(carta);
        return carta;
    }
    public void repartirJugador(){
        Iterator it = jugadores.iterator();
        while (it.hasNext()) {
            Player jugador = (Player) it.next();
            if (jugador.getCantidad() < 2) {
                jugador.setCartas(obtenerCarta());
            }
        }
    }
    public void repartirMesa(){
        if (mesa.getCantidad() == 4) {
            mesa.setCartas(obtenerCarta());
        }
        if (mesa.getCantidad() == 3) {
            mesa.setCartas(obtenerCarta());
        }
        if (mesa.getCantidad() == 0) {
            mesa.setCartas(obtenerCarta());
            mesa.setCartas(obtenerCarta());
            mesa.setCartas(obtenerCarta());
        }
    }
    public void repartir(){
        obtenerCarta();
        repartirJugador();
        repartirJugador();
        repartirMesa();
    }
    public void verResultados(){
        Iterator it = jugadores.iterator();
        int numeroJugador = 1;
        System.out.println("Este el resultado de las jugadas");
        while (it.hasNext()) {
            Player jugador = (Player) it.next();
            System.out.println("Jugador numero" + numeroJugador++);
            Carta[] cartas = jugador.getCartas();
            for (int i = 0; i < cartas.length; i++) {
                Carta card = cartas[i];
                if (card != null) {
                    System.out.println("Primera carta:\t\t " + card.getNombre() + "   " + card.getPalo());
                }
            }
        }
        System.out.println("/*********************************/");
        Carta[] cartas = mesa.getCartas();
        for (int i = 0; i < cartas.length; i++) {
            Carta card = cartas[i];
            if ( card != null) {
                System.out.println("La "+ (i + 1) + " carta es : " + card.getNombre() + " " + card.getPalo());
            }
        }
    }
    public void limpiar(){
        mesa.limpiar();
        cartasUsadas = new ArrayList<Carta>();
    }
}
