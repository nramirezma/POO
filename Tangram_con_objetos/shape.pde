class Shape{

  boolean seleccionarF=false;
  int posx;
  int posy;
  float angle;
  float an;
  int a;
  int b;
  int c;
  int x;
  int y;

  Shape(float angle_,int posx_, int posy_,int a_,int b_,int c_){
    angle = angle_;
    posx = posx_;
    posy = posy_;
    a = a_;
    b = b_;
    c = c_;
    x = posx_;
    y = posy_;
    an = angle_;

  }

  void keyReleased(){
      if (((dist(posx, posy, mouseX, mouseY)<40)||seleccionarF)&&(keyPressed)){
        if(key=='a'){
          angle = angle + radians(45);
          delay(100);
        }
       if(key=='d'){
          angle = angle - radians(45);
          delay(100);
        }
  }
}

  void display(){

    limitesF();
    movTeclado();
    keyReleased();

  }

  void Mov(){
    if ((dist(posx, posy, mouseX, mouseY)<40)&&(mousePressed)) {

      posx=mouseX;
      posy=mouseY;


    }
  }


void limitesF(){

  if(posx>=1000){
    posx= 1000;
  }else if(posx<=25){
    posx=25;
  }else if(y>=1000){
    posy= 1000;
  }else if(posy<=25){
    posy=25;
  }
  }


  void movTeclado(){

    if (seleccionarF){
      if(keyPressed){
        switch(keyCode){

          case UP:
          posy--;
          break;
          case DOWN:
          posy++;
          break;
          case RIGHT:
          posx++;
          break;
          case LEFT:
          posx--;
          break;
          default:
          break;
       }
     }
   }

  }

  void resetear(){
    posx=x;
    posy=y;
    angle = an;
  }
}
