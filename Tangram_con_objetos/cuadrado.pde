class Cuadrado extends Shape{
  int posx1;
  int posy1;
  int posx2;
  int posy2;
  int posx3;
  int posy3;
  int posx4;
  int posy4;
  
  Cuadrado(float angle_,int posx_, int posy_,int posx1_,int posy1_,int posx2_,int posy2_,int posx3_,int posy3_,int posx4_,int posy4_,int a_,int b_,int c_){
    super(angle_,posx_,posy_,a_,b_,c_);
     posx1=posx1_;
     posy1=posy1_;
     posx2=posx2_;
     posy2=posy2_;
     posx3=posx3_;
     posy3=posy3_;
     posx4=posx4_;
     posy4=posy4_;
  }
  void keyReleased(){
    if ((dist(posx, posy, mouseX, mouseY)<40)&&(keyPressed)) {
      if (key== 'a') {
        angle= angle+ radians(22.5);
        delay(100);
      }
      if (key== 'd') {
        angle = angle - radians(22.5);
        delay(100);
      }
    }
  }
  
  void PintarCuadrado(){
    
    fill(a,b,c);
    push();
    translate(posx,posy);
    rotate(angle);
    quad(posx1,posy1,posx2,posy2,posx3,posy3,posx4,posy4);
    fill(a,b,c);
    noStroke();
    circle(0,0,20);
    pop();
  }
  
  
}
