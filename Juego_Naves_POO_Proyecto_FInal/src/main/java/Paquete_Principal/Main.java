package Paquete_Principal;
import Paquete_Objetos.Rectangulo_Dibujo;
import Paquete_Objetos.Nave_Dibujo;
import Paquete_Objetos.Ventana;
import Paquete_Objetos.Panel_Dibujos_de_Figuras;
import Paquete_Objetos.Texto;
import Paquete_Objetos.Posicion;
import Paquete_Objetos.Slides;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static Slides Menu;
    
    
    //metodo para posicion aleatoria de los asteriodes
    public static int Aleatorio(int Max,int Min){
        return (int)(Math.random()*(Max-Min));
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Ventana ventana_visualizacion=new Ventana("Juego de naves");
        ArrayList ArregloDeObjetos=new ArrayList();
        Menu = new Slides();
        
        //nave
        Posicion Pos3=new Posicion(475,500);
        Posicion Pos4=new Posicion(425,575);
        Posicion Pos5=new Posicion(525,575);
        
        Nave_Dibujo nave=new Nave_Dibujo(Pos3,Pos4,Pos5,Color.white);
        
        Texto Vidas=new Texto("Vidas",Color.white,1700,50);
        Vidas.setSize(35);
        ArregloDeObjetos.add(Vidas);
        
        Texto Score=new Texto("Puntos",Color.white,1700,250);
        Score.setSize(35);
        ArregloDeObjetos.add(Score);
        
        Texto Puntaje=new Texto("0",Color.red,1700,350);
        Puntaje.setSize(40);
        ArregloDeObjetos.add(Puntaje);
        
        Texto Nvidas=new Texto("3",Color.red,1700,150);
        Nvidas.setSize(40);
        ArregloDeObjetos.add(Nvidas);
        
        Texto textofinal=new Texto("Fin del juego,Crack",Color.ORANGE,800,300);
        textofinal.setSize(70);
        
        
        int rango=Aleatorio(800,50);
        Posicion Salida=new Posicion(rango,0);
        Rectangulo_Dibujo Asteriode1=new Rectangulo_Dibujo(Salida,25,25,Color.magenta);
        
        int rango1=Aleatorio(800,50);
        Posicion Salida1=new Posicion(rango1,0);
        Rectangulo_Dibujo Asteriode2=new Rectangulo_Dibujo(Salida1,25,25,Color.magenta);
        
        int rango2=Aleatorio(800,50);
        Posicion Salida2=new Posicion(rango2,0);
        Rectangulo_Dibujo Asteriode3=new Rectangulo_Dibujo(Salida2,25,25,Color.magenta);
        
        int rango3=Aleatorio(800,50);
        Posicion Salida3=new Posicion(rango3,0);
        Rectangulo_Dibujo Asteriode4=new Rectangulo_Dibujo(Salida3,25,25,Color.magenta);
      
        int rango4=Aleatorio(800,50);
        Posicion Salida4=new Posicion(rango4,0);
        Rectangulo_Dibujo Asteriode5=new Rectangulo_Dibujo(Salida4,25,25,Color.magenta);
        
        int rango5=Aleatorio(800,50);
        Posicion Salida5=new Posicion(rango5,0);
        Rectangulo_Dibujo Asteriode6=new Rectangulo_Dibujo(Salida5,25,25,Color.magenta);
        
        ArregloDeObjetos.add(Asteriode1);
        ArregloDeObjetos.add(Asteriode2);
        ArregloDeObjetos.add(Asteriode3);
        ArregloDeObjetos.add(Asteriode4);
        ArregloDeObjetos.add(Asteriode5);
        ArregloDeObjetos.add(Asteriode6);
        
        ArregloDeObjetos.add(nave);
        Panel_Dibujos_de_Figuras Panel_Principal=new Panel_Dibujos_de_Figuras(ArregloDeObjetos);
        
        Panel_Principal.ONave(nave);
        Panel_Principal.OAst(Asteriode1, Asteriode2, Asteriode3, Asteriode4, Asteriode5,Asteriode6);
        Panel_Principal.IFinal(textofinal);
        Panel_Principal.Cvida(Nvidas);
        Panel_Principal.CPuntos(Puntaje);
        
        ventana_visualizacion.add(Panel_Principal);
        ventana_visualizacion.setSize(1000,600);
        
            ventana_visualizacion.setSize(1000,600);
            Menu.setVisible(Menu.show);
            Thread.sleep(10000);
            Menu.show=false;
            ventana_visualizacion.setVisible(!Menu.show);
            Panel_Principal.iniciar();
    }
}
