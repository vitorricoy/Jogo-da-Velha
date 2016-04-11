/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.velha;

import javax.swing.JFrame;

/**
 *
 * @author umcan
 */
public class JogoDaVelha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Janela janela = new Janela();
        JFrame fr= new JFrame("Jogo da Velha");
        fr.add(janela);
        janela.repaint();
        fr.setSize(800, 600);
        fr.setResizable(false);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
