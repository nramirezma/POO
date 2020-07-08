package Paquete_Objetos;

import java.util.ArrayList;


public class Nave extends Posicion{
    
    public Posicion Pos1=new Posicion();
    public Posicion Pos2=new Posicion();
    ArrayList balas= new ArrayList();
    
    public Nave(){
        super();
        
        this.Pos1.setX(0);
        this.Pos1.setY(0);
        
        this.Pos2.setX(0);
        this.Pos2.setY(0);
    }
    
    public Nave(Posicion a,Posicion b,Posicion c){
        super(a.getX(),a.getY());
        
        this.Pos1.setX(b.getX());
        this.Pos1.setY(b.getY());
        
        this.Pos2.setX(c.getX());
        this.Pos2.setY(c.getY());
    }
    public Nave(Nave c){
        super(c.getX(),c.getY());
        
        this.Pos1.setX(c.getX());
        this.Pos1.setY(c.getY());
        
        this.Pos2.setX(c.getX());
        this.Pos2.setY(c.getY());
    }
    public void SetVertice(Posicion nva,int lado){
        if(lado==1){
            this.setX(nva.getX());
            this.setY(nva.getY());
        }
        if(lado==2){
            this.Pos1.setX(nva.getX());
            this.Pos1.setY(nva.getY());
        }
        if(lado==3){
            this.Pos2.setX(nva.getX());
            this.Pos2.setY(nva.getY());
        }
    }
    public void mover(Posicion NvaPos){
        SetVertice((this.Suma(NvaPos)),1);
        SetVertice((this.Pos1.Suma(NvaPos)),2);
        SetVertice((this.Pos2.Suma(NvaPos)),3);  
    }
}
