class Boton{
  Boolean accionado = false;
  int X;
  int Y;
  int wid;
  int heig;
  PImage img;
  
  Boton(int X_, int Y_, PImage img_, int wid_, int heig_){
    
    X=X_;
    Y=Y_;
    img=img_;
    wid=wid_;
    heig=heig_;
    
  }

  void display(){
    mousePressed();
    
    push();
    image(img,X,Y,wid,heig);
    pop();
  }
  
  
  
  
  void keyReleased(){
      if((keyPressed)){
        if(key=='r'){
          accionado = false;
          delay(100);
        }
      }
  }
  
  void mousePressed() {
    if ((mouseButton == LEFT)&&(dist(X+wid/2, Y+heig/2, mouseX, mouseY)<=60)) {
      accionado=true;
      delay(100);
    }
  }
}
