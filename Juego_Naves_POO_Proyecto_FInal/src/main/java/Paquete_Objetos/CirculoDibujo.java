package Paquete_Objetos;

import java.awt.Color;
import java.awt.Graphics;


public class CirculoDibujo extends Circulo implements Dibujable{
    
    Color color;
    
    public CirculoDibujo(Posicion Pos,float radio,Color xcolor){
        super(Pos,radio);
        this.color=xcolor;
    }

    @Override
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.fillOval((int)(this.getX()-this.getRadio()),(int)(this.getY()-this.getRadio()),(int)(2*this.getRadio()),(int)(2*this.getRadio()));
    }
    
    void pintar(Color b){
        this.color=b;
    }
}
