package Paquete_Objetos;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;

public class Ventana extends JFrame implements WindowListener{
    
    public Ventana(String titulo){
        super(titulo);
        setSize(500,500);
        addWindowListener(this);
        setBackground(Color.black);       
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {System.exit(0);       
    }

    @Override
    public void windowClosed(WindowEvent e) {        
    }

    @Override
    public void windowIconified(WindowEvent e) {  
    }

    @Override
    public void windowDeiconified(WindowEvent e) {    
    }

    @Override
    public void windowActivated(WindowEvent e) {    
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
