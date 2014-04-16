/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.poker.game;

import java.util.ArrayList;

/**
 *
 * @author Sail3
 */
public class Inicializador {
    public static Carta[] getCartas(){
        
        Carta[] cartas = new Carta[51];
        Carta[] car = {
                    new Carta("Ace", "Hearts",1),
                    new Carta("Two", "Hearts",2),
                    new Carta("Three", "Hearts",3),
                    new Carta("Four", "Hearts",4),
                    new Carta("Five", "Hearts",5),
                    new Carta("Six", "Hearts",6),
                    new Carta("Seven", "Hearts",7),
                    new Carta("Eight", "Hearts",8),
                    new Carta("Nine", "Hearts",9),
                    new Carta("Ten", "Hearts",10),
                    new Carta("Jack", "Hearts",11),
                    new Carta("Queen", "Hearts",12),
                    new Carta("King", "Hearts",13),
                    new Carta("Ace", "Diamonds",1),
                    new Carta("Two", "Diamonds",2),
                    new Carta("Three", "Diamonds",3),
                    new Carta("Four", "Diamonds",4),
                    new Carta("Five", "Diamonds",5),
                    new Carta("Six", "Diamonds",6),
                    new Carta("Seven", "Diamonds",7),
                    new Carta("Eight", "Diamonds",8),
                    new Carta("Nine", "Diamonds",9),
                    new Carta("Ten", "Diamonds",10),
                    new Carta("Jack", "Diamonds",11),
                    new Carta("Queen", "Diamonds",12),
                    new Carta("King", "Diamonds",13),
                    new Carta("Ace", "Clubs",1),
                    new Carta("Two", "Clubs",2),
                    new Carta("Three", "Clubs",3),
                    new Carta("Four", "Clubs",4),
                    new Carta("Five", "Clubs",5),
                    new Carta("Six", "Clubs",6),
                    new Carta("Seven", "Clubs",7),
                    new Carta("Eight", "Clubs",8),
                    new Carta("Nine", "Clubs",9),
                    new Carta("Ten", "Clubs",10),
                    new Carta("Jack", "Clubs",11),
                    new Carta("Queen", "Clubs",12),
                    new Carta("King", "Clubs",13),
                    new Carta("Ace", "Spades",1),
                    new Carta("Two", "Spades",2),
                    new Carta("Three", "Spades",3),
                    new Carta("Four", "Spades",4),
                    new Carta("Five", "Spades",5),
                    new Carta("Six", "Spades",6),
                    new Carta("Seven", "Spades",7),
                    new Carta("Eight", "Spades",8),
                    new Carta("Nine", "Spades",9),
                    new Carta("Ten", "Spades",10),
                    new Carta("Jack", "Spades",11),
                    new Carta("Queen", "Spades",12),
                    new Carta("King", "Spades",13)
        };
        return car;
    }
    
    /**
     *
     * @return
     */
    public static ArrayList<Carta> getCartasAL(){
        ArrayList<Carta> carta = new ArrayList<Carta>();
        carta.add(new Carta("Ace", "Hearts",1));
        carta.add(new Carta("Two", "Hearts",2));
        carta.add(new Carta("Three", "Hearts",3));
        carta.add(new Carta("Four", "Hearts",4));
        carta.add(new Carta("Five", "Hearts",5));
        carta.add(new Carta("Six", "Hearts",6));
        carta.add(new Carta("Seven", "Hearts",7));
        carta.add(new Carta("Eight", "Hearts",8));
        carta.add(new Carta("Nine", "Hearts",9));
        carta.add(new Carta("Ten", "Hearts",10));
        carta.add(new Carta("Jack", "Hearts",11));
        carta.add(new Carta("Queen", "Hearts",12));
        carta.add(new Carta("King", "Hearts",13));
        carta.add(new Carta("Ace", "Diamonds",1));
        carta.add(new Carta("Two", "Diamonds",2));
        carta.add(new Carta("Three", "Diamonds",3));
        carta.add(new Carta("Four", "Diamonds",4));
        carta.add(new Carta("Five", "Diamonds",5));
        carta.add(new Carta("Six", "Diamonds",6));
        carta.add(new Carta("Seven", "Diamonds",7));
        carta.add(new Carta("Eight", "Diamonds",8));
        carta.add(new Carta("Nine", "Diamonds",9));
        carta.add(new Carta("Ten", "Diamonds",10));
        carta.add(new Carta("Jack", "Diamonds",11));
        carta.add(new Carta("Queen", "Diamonds",12));
        carta.add(new Carta("King", "Diamonds",13));
        carta.add(new Carta("Ace", "Clubs",1));
        carta.add(new Carta("Two", "Clubs",2));
        carta.add(new Carta("Three", "Clubs",3));
        carta.add(new Carta("Four", "Clubs",4));
        carta.add(new Carta("Five", "Clubs",5));
        carta.add(new Carta("Six", "Clubs",6));
        carta.add(new Carta("Seven", "Clubs",7));
        carta.add(new Carta("Eight", "Clubs",8));
        carta.add(new Carta("Nine", "Clubs",9));
        carta.add(new Carta("Ten", "Clubs",10));
        carta.add(new Carta("Jack", "Clubs",11));
        carta.add(new Carta("Queen", "Clubs",12));
        carta.add(new Carta("King", "Clubs",13));
        carta.add(new Carta("Ace", "Spades",1));
        carta.add(new Carta("Two", "Spades",2));
        carta.add(new Carta("Three", "Spades",3));
        carta.add(new Carta("Four", "Spades",4));
        carta.add(new Carta("Five", "Spades",5));
        carta.add(new Carta("Six", "Spades",6));
        carta.add(new Carta("Seven", "Spades",7));
        carta.add(new Carta("Eight", "Spades",8));
        carta.add(new Carta("Nine", "Spades",9));
        carta.add(new Carta("Ten", "Spades",10));
        carta.add(new Carta("Jack", "Spades",11));
        carta.add(new Carta("Queen", "Spades",12));
        carta.add(new Carta("King", "Spades",13));
        return carta;
    }

}
