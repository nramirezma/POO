package Paquete_Objetos;

public class Posicion {
    
    private float x;
    private float y;
    
    public Posicion(){
        this.x=0;
        this.y=0;
    }
    public Posicion(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Posicion(Posicion nva){
        this.x=nva.x;
        this.y=nva.y;
    }
    
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public Posicion Suma(Posicion S){
        
        float Sumx=this.x+S.getX();
        float Sumy=this.y+S.getY();
        
        Posicion Pos=new Posicion(Sumx,Sumy);
        
        return Pos;
    }
}