package Paquete_Objetos;

public class Circulo extends Posicion{
    
    private float radio;
    
    public Circulo(){
        super();
        this.radio=0;
    }
    public Circulo(Posicion nvo,float r){
        super(nvo);
        this.radio=r;
    }
    public Circulo(Circulo cir){
        super(cir);
        this.radio=cir.radio;        
    }
    public float getRadio(){
        return this.radio;
    }
    public void setRadio(float r){
        this.radio=r;
    }
    public Posicion getCentro(){
        Posicion nva=new Posicion(this.getX(),this.getY());
        return nva;
    }
}
