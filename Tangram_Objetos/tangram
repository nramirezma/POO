boolean gano=true;
boolean show=true;
boolean accionado=false;
boolean figura = false;

PImage img;
PImage img2;
PImage b1;
PImage b2;
PImage bc;

float mir;

Creador Rx;

Boton N1;
Boton N2;
Boton CR;

Triangulo TG1;
Triangulo TG2;
Triangulo TM;
Triangulo TP1;
Triangulo TP2;
Paralelogramo P;
Cuadrado C;


void setup() {
  size(1000, 1000, P2D);

  img= loadImage("casa_poo.png");
  img2 = loadImage("pato_poo.png");
  b1= loadImage("PLAY 2.png");
  b2= loadImage("PLAY 2xd.png");
  bc= loadImage("CREA.png");


  TG1= new Triangulo(0,220,150,0,70,120,-50,-120,-50,240,50,60);
  TG2= new Triangulo(0,290,220,-70, 0, 50, -120, 50, 120,0, 128, 0);
  TM= new Triangulo(0,140,300,-40, 40, 80, 40, -40, -80,255, 0, 128);
  TP1= new Triangulo(0,280,320,60, 20, 0, -40, -60, 20,255, 255, 0);
  TP2= new Triangulo((PI/2),180,220,60, 20, 0, -40, -60, 20,255, 112, 40);
  P= new Paralelogramo(0,130,190,-30, -90, -30, 30, 30, 90, 30,-30,80, 20, 200);
  C= new Cuadrado(0,220,280,0, -60, 60, 0, 0, 60, -60, 0,255,100,100);

  N1 = new Boton(100, 4*height/5, b1, 250, 120);
  N2 = new Boton(700, 4*height/5, b2, 250, 120);
  CR = new Boton(400, 4*height/5, bc, 250, 120);
  
}

void draw(){

  keyReleased();
  
  if (!N1.accionado && !N2.accionado && !CR.accionado){

    background(215);

    N1.display();
    N2.display();
    CR.display();

    TG1.resetear();
    TG2.resetear();
    TM.resetear();
    TP1.resetear();
    TP2.resetear();
    P.resetear();
    C.resetear();

  }

  if (N1.accionado){

    background(255);

    show = false;

    image(img,500,400,362,327);

    TG1.display();
    TG1.PintarTriangulo();

    TG2.display();
    TG2.PintarTriangulo();

    TM.display();
    TM.PintarTriangulo();

    TP1.display();
    TP1.PintarTriangulo();

    TP2.display();
    TP2.PintarTriangulo();
    P.keyReleased();

    P.display();
    P.PintarParalelogramo();

    C.display();
    C.PintarCuadrado();

    N1.keyReleased();

    GanoJuego();
  }

  if (N2.accionado){

    background(255);

    show = false;

    image(img2,500,400,345,385);

    TG1.display();
    TG1.PintarTriangulo();

    TG2.display();
    TG2.PintarTriangulo();

    TM.display();
    TM.PintarTriangulo();

    TP1.display();
    TP1.PintarTriangulo();

    TP2.display();
    TP2.PintarTriangulo();
    P.keyReleased();

    P.display();
    P.PintarParalelogramo();

    C.display();
    C.PintarCuadrado();

    N2.keyReleased();

    GanoJuego();
  }

  if (CR.accionado){

    background(255);

    push();
    stroke(128,64,0);
    strokeWeight(4);
    fill(255);
    quad(400,400,900,400,900,900,400,900);
    pop();

     if (figura){
       
      Rx.genCua();
      Rx.genPara();
      Rx.genTrian();
      GanoJuego();
   
      
    }

    show = false;

    TG1.display();
    TG1.PintarTriangulo();

    TG2.display();
    TG2.PintarTriangulo();

    TM.display();
    TM.PintarTriangulo();

    TP1.display();
    TP1.PintarTriangulo();

    TP2.display();
    TP2.PintarTriangulo();
    P.keyReleased();

    P.display();
    P.PintarParalelogramo();

    C.display();
    C.PintarCuadrado();

    CR.keyReleased();

    if (accionado){
      
      int[] pos = {TG1.posx, TG1.posy, TG2.posx, TG2.posy, TM.posx, TM.posy, TP1.posx, TP1.posy, TP2.posx, TP2.posy, P.posx, P.posy , C.posx, C.posy};
      
      float[] ang={TG1.angle,TG2.angle,TM.angle,TP1.angle,TP2.angle,P.angle,C.angle};

      mir = P.mirror;
      
      delay(100);

      Rx = new Creador(pos[0],pos[1],ang[0],pos[2],pos[3],ang[1],pos[4],pos[5],ang[2],pos[6],pos[7],ang[3],pos[8],pos[9],ang[4],pos[10],pos[11],ang[5],mir,pos[12],pos[13],ang[6]);

      TG1.resetear();
      TG2.resetear();
      TM.resetear();
      TP1.resetear();
      TP2.resetear();
      P.resetear();
      C.resetear();

      accionado = false;

      figura = true;
      }
  }
  
  //Evitar solapamiento

    solapamiento();
}

void GanoJuego() {
  color negro=color(0,0,0);
  loadPixels();
  int contador=0;
  //Verificacion pixel a pixel
  for (int i=0; i<(width * height); i++) {
    //lectura pixel a pixel
    color dcp=color(pixels[i]);
    if (negro==dcp) {
      contador++;
    }
  }
  if (contador <= 2000 ) {
    gano=true;
    background(0);
    fill(255,255,255);
    textSize(50);
    text("Felicidades, lo lograste!", width/6-15, height/2);
    figura = false;
    text("Oprime 'r' para volver al menu", width/6, 2*height/3);
  }
  else{
    gano=false;
    fill(0, 0, 0);
    textSize(50);
    text("¡Revisa el tangram,Crack!", 50, 50);
  }
}


void solapamiento (){
  if (((TG2.posx != mouseX && TG2.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY))){

    TG1.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY)){

    TG2.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TG2.posx != mouseX && TG2.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY)){

    TM.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TG2.posx != mouseX && TG2.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY)){

    TP1.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TG2.posx != mouseX && TG2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY)){

    TP2.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(TG2.posx != mouseX && TG2.posy != mouseY)
  &&(C.posx != mouseX && C.posy != mouseY)){

    P.Mov();
  }

  if ((TG1.posx != mouseX && TG1.posy != mouseY)&&(TM.posx != mouseX && TM.posy != mouseY)&&
  (TP1.posx != mouseX && TP1.posy != mouseY)&&(TP2.posx != mouseX && TP2.posy != mouseY)&&(P.posx != mouseX && P.posy != mouseY)
  &&(TG2.posx != mouseX && TG2.posy != mouseY)){

    C.Mov();
  }
}

void keyReleased(){
  if((keyPressed)){
    if(key=='x'){
      accionado = true;
      delay(100);
    }
    
    if(key=='r'){
      figura = false;
      delay(100);
    }
  }
}
