/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author umcan
 */
public class Janela extends JPanel{
    
    ImageIcon imgX = new ImageIcon("Imagens/X.png");
    ImageIcon imgO = new ImageIcon("Imagens/O.png");
    private char[][] tabuleiro;
    
    public Janela(){
        tabuleiro=new char[3][3];
        this.setVisible(true);
        this.setBackground(Color.WHITE);
        for (int I=0; I<=2; I++){
            for (int J=0; J<=2; J++){
                tabuleiro[I][J]='.';
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {

       super.paintComponent(g);
       g.drawLine(0, 200, 800, 200);
       g.drawLine(0, 400, 800, 400);
       g.drawLine(267, 0, 267, 600);
       g.drawLine(533, 0, 533, 600);
       
       
       
    }  
    private void desenharJog(char t, Graphics g, int x, int y){
        switch (t){
           case 'X': imgX.paintIcon(this, g, x, y); break;
           case 'O': imgO.paintIcon(this, g, x, y); break;
           case '.': break;
       }
    }
}
