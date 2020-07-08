package Paquete_Objetos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Nave_Dibujo extends Nave implements Dibujable{

    Color color;
    
    public Nave_Dibujo(Posicion a,Posicion b,Posicion c,Color xcolor){
        super(a,b,c);
        this.color=xcolor;
    }
    
    @Override
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        int x[]={(int)this.getX(),(int)this.Pos1.getX(),(int)this.Pos2.getX()};
        int y[]={(int)this.getY(),(int)this.Pos1.getY(),(int)this.Pos2.getY()};
        
        Polygon p=new Polygon(x,y,3);
        dw.fillPolygon(p);
    }
    public void Pintar(Graphics dw,Color xcolor) {
        dw.setColor(xcolor);
        int x[]={(int)this.getX(),(int)this.Pos1.getX(),(int)this.Pos2.getX()};
        int y[]={(int)this.getY(),(int)this.Pos1.getY(),(int)this.Pos2.getY()};
        
        Polygon p=new Polygon(x,y,3);
        dw.fillPolygon(p);
    }
    
    public void Ciclo1(){
        for(int i=0;i<this.balas.size();i++){
            CirculoDibujo y=(CirculoDibujo) this.balas.get(i);
            float x=y.getY();
            y.setY(x-=5);
        }
    }
    
    public CirculoDibujo Bala(){
        Posicion salida=new Posicion(this.getX(),this.getY());
        CirculoDibujo bala=new CirculoDibujo(salida,10,Color.blue);
        return bala;  
    }    
}
