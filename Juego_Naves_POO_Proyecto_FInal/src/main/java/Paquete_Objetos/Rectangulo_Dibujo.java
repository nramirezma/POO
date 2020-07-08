package Paquete_Objetos;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo_Dibujo extends Rectangulo implements Dibujable{
    
    Color color;
    
    public Rectangulo_Dibujo(Posicion Pos,float x,float y,Color xcolor){
        super(Pos,x,y);
        this.color=xcolor;      
    }
    
    public void Ciclo2(int mov){
        float x=this.getY();
        this.setY(x+=mov);
    }
    void pintar(Color c){
        this.color=c;
    }

    @Override
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.fillRect((int)this.getX(),(int)this.getY(),(int)this.Getlado(1),(int)this.Getlado(2));
    }
}
