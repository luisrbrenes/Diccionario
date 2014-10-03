

package GUI;


import Logic.Juego;

import java.awt.event.MouseEvent;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuJuego {
 private final JFrame frameventana;
    private final JPanel Panel;
    private JLabel labelscrabble;
    private JButton botonjugar;
    
    
    
    public MenuJuego()
    {   
        //creacion contenedor.
        frameventana=new JFrame();
        frameventana.setVisible(true);
        frameventana.setSize(400,400);
        frameventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameventana.setLocationRelativeTo(null);
        frameventana.setLayout(null);
        frameventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameventana.setEnabled(true);
        
        //creacion del panel.
        Panel= new JPanel();
        Panel.setBackground(Color.LIGHT_GRAY);
        Panel.setBounds(0,0,400,400);
        Panel.setLayout(null);
        frameventana.add(Panel);
        
        //label de texto scrabble.  
        labelscrabble=new javax.swing.JLabel();
        labelscrabble.setText("SCRABBLE");  
        Panel.add(labelscrabble);
        labelscrabble.setBounds(100, 30, 180, 70);
        labelscrabble.setFont(new java.awt.Font("Lucida Sans Typewriter", 7, 36)); // NOI18N

        //creacion boton.
        //boton jugar.
        botonjugar = new javax.swing.JButton();
        botonjugar.setBackground(new java.awt.Color(100, 137, 234));
        botonjugar.setText("Jugar");
        Panel.add(botonjugar);
        botonjugar.setBounds(150, 140, 90, 40);
        botonjugar.setVisible(true);    
        botonjugar.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        try {
            JugarMouseClicked(evt);
        } catch (IOException ex) {
            Logger.getLogger(MenuJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    });
    }
    
     
    
private void JugarMouseClicked(java.awt.event.MouseEvent evt) throws FileNotFoundException, IOException {                                
this.frameventana.setEnabled(true);
    try{
        this.frameventana.hide();
        VentanaJuego ventanajuego= new VentanaJuego();
        Juego tablero=new Juego();
        tablero.IniciarTablero(ventanajuego);
        tablero.LabelManoJugador(ventanajuego);
        tablero.InteraccionUsuario();
        tablero.creaJugadores();
        tablero.creaFichas();
        tablero.desordenarFichas();   
        tablero.repartirFichas();
        tablero.setPrimerJugador();
    }catch(Exception e){
        }
    /*try{
    this.frameventana.hide(); 
    VentanaJuego ventanajuego= new VentanaJuego();
    Juego tablero=new Juego(); 
    tablero.IniciarTablero(ventanajuego);
    tablero.LabelManoJugador(ventanajuego);
    tablero.InteraccionUsuario();
    tablero.creaJugadores();
    tablero.creaFichas();
    tablero.desordenarFichas(); 
    tablero.repartirFichas();
    tablero.setPrimerJugador();*/
    /*tablero.IniciarTablero(ventanajuego);
    tablero.LabelManoJugador(ventanajuego);
   // tablero.ActualizarManoActualJugador(ventanajuego,tablero.LabelManoJugador(ventanajuego));
    ventanajuego.CreaFichas(evt);
    tablero.setNumero_de_jugadores(tablero.InteraccionUsuario());*/
    //tablero.ActualizarManoActualJugador(ventanajuego,tablero.LabelManoJugador(ventanajuego));
//}catch(Exception e){
       // }
    /*tablero.IniciarTablero(ventanajuego);
    tablero.LabelManoJugador(ventanajuego);
    tablero.InteraccionUsuario();
    tablero.creaJugadores();
    tablero.creaFichas();
    tablero.desordenarFichas(); 
    tablero.repartirFichas();
    tablero.setPrimerJugador();*/
    
}
        

public boolean isEnabled(){
    return frameventana.isEnabled();
    
}
    public void addLabel(JLabel lbl)
    {   Panel.add(lbl);   }    
}
