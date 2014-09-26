/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Briam
 */
public class VentanaJuego {
    private final JFrame frameventana;
    private final JPanel Panel;
    private JLabel image;
   
    public VentanaJuego()
    {
        frameventana= new JFrame();
        frameventana.setVisible(true);
        frameventana.setSize(600,600);
        frameventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameventana.setLocationRelativeTo(null);
        frameventana.setLayout(null);
        
        Panel= new JPanel();
        Panel.setBackground(Color.gray);
        Panel.setBounds(0,0,600,600);
        Panel.setLayout(null);
        
        frameventana.add(Panel);
}
    public void addLabel(JLabel lbl)
    {
        
        Panel.add(lbl);
    }
}
