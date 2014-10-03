
package GUI;
 

import Logic.Juego; 
import java.awt.event.MouseEvent;
import Logic.Jugador;
import Logic.Validaciones;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VentanaJuego {
    private final JFrame frameventana;
    private final JPanel Panel;
    private JLabel image;
    private JButton botonfichas;
    private JButton boton_arriba;
    private JButton boton_abajo;
    private JButton boton_der;
    private JButton boton_izq;
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
///////////////////////////////////////////////////////////////////////////////        
//botones keylistener para mover puntero.
        
        //boton arriba.
        boton_arriba = new javax.swing.JButton();
        boton_arriba.setBackground(new java.awt.Color(100, 137, 234));
        boton_arriba.setText("A");
        Panel.add(boton_arriba);
        boton_arriba.setBounds(513, 0, 50,30);
        boton_arriba.setVisible(true);    
       // boton_arriba.addKeyListener(null);
        
        //boton abajo.
        boton_abajo = new javax.swing.JButton();
        boton_abajo.setBackground(new java.awt.Color(100, 137, 234));
        boton_abajo.setText("B");
        Panel.add(boton_abajo);
        boton_abajo.setBounds(513, 80, 50,30);
        boton_abajo.setVisible(true);    
        //boton_abajo.addKeyListener(null);
        
        //boton izquierda
        boton_der = new javax.swing.JButton();
        boton_der.setBackground(new java.awt.Color(100, 137, 234));
        boton_der.setText("I");
        Panel.add(boton_der);
        boton_der.setBounds(480, 40, 50, 30);
        boton_der.setVisible(true);    
       // boton_der.addKeyListener(null);
        
        //boton derecha.
        boton_der = new javax.swing.JButton();
        boton_der.setBackground(new java.awt.Color(100, 137, 234));
        boton_der.setText("D");
        Panel.add(boton_der);
        boton_der.setBounds(550, 40, 55, 30); 
        boton_der.setVisible(true);    
       // boton_der.addKeyListener(null);
       
        //agregar keylisteners.
       // boton_arriba.addActionListener(KeyListener);
   
        /*boton_arriba.addKeyListener(java.awt.event.KeyAdapter());
        boton_abajo.addKeyListener(null);
        boton_der.addKeyListener(null);
        boton_izq.addKeyListener(null);*/
 ///////////////////////////////////////////////////////////////////////////////// 
        
         //boton jugar.
        botonfichas = new javax.swing.JButton();
        botonfichas.setBackground(new java.awt.Color(100, 137, 234));
        botonfichas.setText("Start");
        Panel.add(botonfichas);
        botonfichas.setBounds(490, 200, 100, 40);
        botonfichas.setVisible(true);    
        botonfichas.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override 
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        CreaFichas(evt);
        
    }
    });
  
    }  
   
    public void CreaFichas(java.awt.event.MouseEvent evt){
        /*System.out.println("hola");
        Juego tablero=new Juego();
        tablero.creaJugadores();
        tablero.creaFichas();
        tablero.desordenarFichas(); 
        tablero.repartirFichas();*/
        
        
        //tablero.setPrimerJugador();me tira excepcion.
    }
   
    public void keyTyped(KeyEvent evt){ 
        Juego juego=new Juego();
        switch(evt.getKeyCode()){
            case KeyEvent.VK_W:
                juego.muevePuntero("arriba");             
                break;
            case KeyEvent.VK_S:
               juego.muevePuntero("abajo"); 
                break;
            case KeyEvent.VK_A:
                juego.muevePuntero("derecha"); 
                break;
            case KeyEvent.VK_D:
                juego.muevePuntero("izquierda"); 
                break;
        }
    }
    
    
    public void addLabel(JLabel lbl){   
        Panel.add(lbl);   
    }
    
    
    public void addButton(JButton b){  
        Panel.add(b);
    }
    public void visible(){
       frameventana.setVisible(true);
    }
    
}
