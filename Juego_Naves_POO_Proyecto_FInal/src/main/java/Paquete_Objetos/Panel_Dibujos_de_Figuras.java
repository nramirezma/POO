package Paquete_Objetos;
import static Paquete_Principal.Main.Aleatorio;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel_Dibujos_de_Figuras extends JPanel implements KeyListener{
    
    ArrayList L;
    ArrayList ast=new ArrayList();
    Nave_Dibujo nave;
    Posicion movimientoIzq=new Posicion(-25,0);
    Posicion movimientoDer=new Posicion(25,0);
    Posicion movimientoNulo=new Posicion(0,0);
    
    Boolean FinDeJuego=true;
    int ContadorAsteroides=6;
    int Score;
    int Vidas=3;
    int Mov=10;
    int MAXAST=6;
    
    Texto puntos;
    Texto vidas;
    Texto Final;
    
    public Panel_Dibujos_de_Figuras(ArrayList ListadeO){
        this.L=ListadeO;
        this.addKeyListener(this);
        //KeyEvent solo se enviará al panel si es "enfocable" y tiene foco.
        setFocusable(true);
    }
    // metodo para lo de titilar
    public void paint(Graphics g){
        
        Dimension d=getSize();
        Image Imagen= createImage(d.width,d.height);
        Graphics buff=Imagen.getGraphics();
        
        Dibujable dib;
        for(int i=0;i<L.size();i++){
            dib=(Dibujable)L.get(i);
            dib.dibujar(buff);
        }
        g.drawImage(Imagen,0,0,null);
    }
    
    //metodo que hace de repaint
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) { 
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla=e.getKeyCode();
        
        if(tecla== KeyEvent.VK_LEFT){   
            this.nave.Pintar(this.getGraphics(), Color.black);
            this.nave.mover(movimientoIzq);    
            this.nave.Pintar(this.getGraphics(), Color.white);
        }
        if(tecla== KeyEvent.VK_RIGHT){
            this.nave.Pintar(this.getGraphics(), Color.black);
            this.nave.mover(movimientoDer);
            this.nave.Pintar(this.getGraphics(), Color.white);
        }
        if(tecla==KeyEvent.VK_SPACE){
            CirculoDibujo bala= nave.Bala();
            nave.balas.add(bala);
            L.add(bala);
        }
    }
    
    public void OAst(Rectangulo_Dibujo a,Rectangulo_Dibujo b,Rectangulo_Dibujo c,Rectangulo_Dibujo d,Rectangulo_Dibujo e,Rectangulo_Dibujo f){
       
        ast.add(a);
        ast.add(b);
        ast.add(c);
        ast.add(d);
        ast.add(e);
        ast.add(f); 
    }
    public void ONave(Nave_Dibujo n){
        this.nave=n;
    }
    public void Cvida(Texto b){
        this.vidas=b;
    }
    public void CPuntos(Texto a){
        this.puntos=a;
    }
    public void IFinal(Texto c){
        this.Final=c;
    }

    public void Colision(){
        int i,j;
        for(i=0;i<nave.balas.size();i++){
            CirculoDibujo bala=(CirculoDibujo) nave.balas.get(i);
            for(j=0;j<ast.size();j++){
                Rectangulo_Dibujo aste= (Rectangulo_Dibujo) ast.get(j);
                Posicion Posbala=new Posicion(bala.getX(),bala.getY());
                
                Posicion Derecha=new Posicion(aste.getX()+30,aste.getY());
                Posicion Izquierda=new Posicion(aste.getX()-15,aste.getY());
                Posicion medio=new Posicion(aste.getX(),aste.getY());
                
                //condicion choque aste-bala con las posiciones de x de el aster y la bala 
                if(Posbala.getX()>Izquierda.getX() && Posbala.getX()<Derecha.getX()&& Posbala.getY()<medio.getY()&& Posbala.getY()+25<medio.getY()){
                   aste.pintar(Color.black);
                   bala.pintar(Color.black);
                   bala.setY(-100);
                   aste.setY(-100);
                   nave.balas.remove(bala);
                   ast.remove(aste);
                   ContadorAsteroides--;
                   Score+=5;
                   puntos.SetColor(Color.black);
                   String NuevoScore=""+Score;
                   Texto Npuntos=new Texto(NuevoScore,Color.red,1700,350);
                   Npuntos.setSize(40);
                   puntos=Npuntos;
                   L.add(puntos);
                }
                //condicion de puntaje y vidas
                if(medio.getY()>475 && medio.getY()<550 && (nave.Pos1.getX()<medio.getX())&&nave.Pos2.getX()>medio.getX()){
                    Score=Score-5;
                    Vidas--;
                    String NuevoScore=""+Score;
                    String NuevasVidas=""+Vidas;
                    vidas.SetColor(Color.black);
                    puntos.SetColor(Color.black);
                    Texto Nvidas=new Texto(NuevasVidas,Color.red,1700,150);
                    Nvidas.setSize(40);
                    vidas=Nvidas;
                    Texto NPuntos=new Texto(NuevoScore,Color.red,1700,350);
                    NPuntos.setSize(40);
                    puntos=NPuntos;
                    L.add(vidas);
                    L.add(puntos);
                    
                    
                    ast.remove(aste);
                    aste.setY(2000);
                    ContadorAsteroides--;
               }
            }
        }
    }
    public void iniciar(){
        while(FinDeJuego){
            try{
                if(!nave.balas.isEmpty()){
                    nave.Ciclo1();
                }
                
            int i;
             for(i=0;i<ast.size();i++){
                 Rectangulo_Dibujo rect=(Rectangulo_Dibujo)ast.get(i);
                 rect.Ciclo2(Mov);
                 
                 if(rect.getY()>525){
                    int rango=Aleatorio(800,50);
                    rect.setY(0);
                    rect.setX(rango);
                }
             }
             if(ContadorAsteroides<MAXAST){
                 int rango=Aleatorio(800,50);
                 Posicion Inicio=new Posicion(rango,0);
                 Rectangulo_Dibujo nuevo=new Rectangulo_Dibujo(Inicio,25,25,Color.magenta);
                 ast.add(nuevo);
                 L.add(nuevo);
                 nuevo.Ciclo2(Mov);
                 ContadorAsteroides++;
             }
             
             int Nivel=1;
             String Niveles=""+Nivel;
             Texto TextoNivel=new  Texto("NIVEL",Color.white,1700,500);
             TextoNivel.setSize(50);
             Texto TextoNNivel=new Texto(Niveles,Color.red,1700,600);
             TextoNNivel.setSize(50);
             L.add(TextoNNivel);
             L.add(TextoNivel);
             
             if(Score>=50 && Score<100){
                 Nivel=2;
                 String NuevoNivel=""+Nivel;
                 TextoNNivel.SetColor(Color.black);
                 Texto NNivel=new Texto(NuevoNivel,Color.red,1700,600);
                 NNivel.setSize(40);
                 TextoNNivel=NNivel;
                 L.add(TextoNNivel);
                 Mov=12;
                 MAXAST=7;
                 for(i=0;i<ast.size();i++){
                     Rectangulo_Dibujo rect=(Rectangulo_Dibujo)ast.get(i);
                     rect.pintar(Color.GREEN);
                }
             }
             if(Score>=100 && Score<150){
                 Nivel=3;
                 String NuevoNivel=""+Nivel;
                 TextoNNivel.SetColor(Color.black);
                 Texto NNivel=new Texto(NuevoNivel,Color.red,1700,600);
                 NNivel.setSize(40);
                 TextoNNivel=NNivel;
                 L.add(TextoNNivel);
                 Mov=14;
                 MAXAST=8;
                 for(i=0;i<ast.size();i++){
                     Rectangulo_Dibujo rect=(Rectangulo_Dibujo)ast.get(i);
                     rect.pintar(Color.yellow);
                }
             }
             if(Vidas<=0){
                 FinDeJuego=false;
                 L.add(Final);
             }
             Colision();
             
             //Hilo que se ejecuta para el try que intenta cumplir con todos los condicionales del metodo, si no sale una excepcion,siempre va con try
             Thread.sleep(50);
            }catch(InterruptedException err){System.out.println(err);}
        repaint();
        }
    }
}
