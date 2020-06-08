class Creador {
  int TG1posx;
  int TG1posy;
  float TG1angle;
  int TG2posx;
  int TG2posy;
  float TG2angle;
  int TMposx;
  int TMposy;
  float TMangle;
  int TP1posx;
  int TP1posy;
  float TP1angle;
  int TP2posx;
  int TP2posy;
  float TP2angle;

  int Pposx;
  int Pposy;
  float Pangle;
  float Pmirror;

  int Cposx;
  int Cposy;
  float Cangle;

  Boolean accionado = false;

  Creador(int TG1posx_, int TG1posy_,float TG1angle_,int TG2posx_,int TG2posy_,float TG2angle_,int TMposx_,int TMposy_,float TMangle_,int TP1posx_,
  int TP1posy_,float TP1angle_,int TP2posx_,int TP2posy_,float TP2angle_,int Pposx_,int Pposy_,float Pangle_,float Pmirror_,int Cposx_,int Cposy_,float Cangle_){

    TG1posx=TG1posx_;
    TG1posy=TG1posy_;
    TG1angle=TG1angle_;
    TG2posx=TG2posx_;
    TG2posy=TG2posy_;
    TG2angle=TG2angle_;
    TMposx=TMposx_;
    TMposy=TMposy_;
    TMangle=TMangle_;
    TP1posx=TP1posx_;
    TP1posy=TP1posy_;
    TP1angle=TP1angle_;
    TP2posx=TP2posx_;
    TP2posy=TP2posy_;
    TP2angle=TP2angle_;
    Pposx=Pposx_;
    Pposy=Pposy_;
    Pangle=Pangle_;
    Cposx=Cposx_;
    Cposy=Cposy_;
    Cangle=Cangle_;

  }
  void display(){

    fill(255);
    textSize(25);
    text("Felicidades, lo lograste!", width/6-15, height/2);

    keyReleased();
  }

  void genTrian(){

    fill(0);
    //Grandes
    push();
    translate(TG1posx,TG1posy);
    rotate(TG1angle);
    triangle(0,70,120,-50,-120,-50);

    pop();

    push();
    translate(TG2posx,TG2posy);
    rotate(TG2angle);
    triangle(-70, 0, 50, -120, 50, 120);

    pop();

    //mediano
    push();
    translate(TMposx,TMposy);
    rotate(TMangle);
    triangle(-40, 40, 80, 40, -40, -80);

    pop();

    //pequenios
    push();
    translate(TP1posx,TP1posy);
    rotate(TP1angle);
    triangle(60, 20, 0, -40, -60, 20);

    pop();

    push();
    translate(TP2posx,TP2posy);
    rotate(TP2angle);
    triangle(60, 20, 0, -40, -60, 20);

    pop();
  }

  void genCua(){

    fill(0);
    push();
    translate(Cposx,Cposy);
    rotate(Cangle);
    quad(0, -60, 60, 0, 0, 60, -60, 0);
    pop();

  }

  void genPara(){

    fill(0);
    push();
    translate(Pposx,Pposy);
    rotate(Pangle);
    quad(-30, -90, -30, 30, 30, 90, 30,-30);
    pop();

    if (Pmirror == -1){
      scale(Pmirror,1);
    }
    else {
      scale(1,1);
    }
  }

  void keyReleased(){
      if((keyPressed)){
        if(key=='r'){
          accionado = false;

          delay(100);
        }
      }
  }
}
