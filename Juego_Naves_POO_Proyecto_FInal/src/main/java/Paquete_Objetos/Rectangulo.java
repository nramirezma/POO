package Paquete_Objetos;

public class Rectangulo extends Posicion {

    private float lado1;
    private float lado2;
    
    public Rectangulo(){
        super();
        this.lado1=0;
        this.lado2=0;
    }
    public Rectangulo(Posicion Pos,float x,float y){
        super(Pos);
        this.lado1=x;
        this.lado2=y;
    }
    public Rectangulo(Rectangulo nvo){
        super(nvo.getX(),nvo.getY());
        this.lado1=nvo.lado1;
        this.lado2=nvo.lado2;
    }
    public float Getlado(int lado){
        if (lado==1){
            return this.lado1;
        }
        if (lado==2){
            return this.lado2;
        }
        if(lado!=1 && lado!=2){
            return 0;
        }
        return 0;
    }
}
