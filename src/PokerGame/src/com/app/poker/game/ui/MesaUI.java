/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.poker.game.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Sail3
 */
public class MesaUI extends JComponent{
    JFrame frame;
    public MesaUI(JFrame frame) {
        this.frame = frame;
        repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image imagen = tk.getImage("/com/app/poker/game/ui/cards/Clubs/Ace.jpg");
        g2d.drawImage(imagen, 0, 0,frame);
    }
    
    
    
}
