/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author umcan
 */
public class Janela extends JPanel{
    
    public Janela(){
        this.setVisible(true);
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g) {

       super.paintComponent(g);
       g.drawLine(0, this.getHeight()/3, this.getWidth(), (this.getHeight()/3));
       g.drawLine(0, (this.getHeight()/3)*2, this.getWidth(), (this.getHeight()/3)*2);
       g.drawLine(this.getWidth()/3, 0, this.getWidth()/3, this.getHeight());
       g.drawLine((this.getWidth()/3)*2, 0, (this.getWidth()/3)*2, this.getHeight());
    }  
}