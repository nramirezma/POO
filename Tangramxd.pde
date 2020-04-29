boolean gano=true;

//Para hacer que las figuras queden estaticas, seria poner que cuando se acercaran a tal punto, esta como que haga tp al 
//lugar correspondiente y cancelamos el movimiento, y para que no se solapen seria que si se acercan mucho los puntos entre
//ellos los movemos

//TrianguloGrande1
float angleTG1=0;
int posxTG1=220;
int posyTG1=150;

//Paralelogramo
float angleP=0;
int posxP=130;
int posyP=190;

//TrianguloGrande2
float angleTG2=0;
int posxTG2=290;
int posyTG2=220;

//Cuadrado
float angleC=0;
int posxC=220;
int posyC=280;

//TrianguloMediano
float angleTM=0;
int posxTM=140;
int posyTM=300;

//TrianguloPequeño1
float angleTP1=0;
int posxTP1=280;
int posyTP1=320;

//TrianguloPequeño2
float angleTP2=PI/2;
int posxTP2=180;
int posyTP2=220;

void keyReleased(){
         if((dist(posxTG1,posyTG1,mouseX,mouseY)<20)&&(keyPressed)){
           if(key=='a'){
                 angleTG1=angleTG1+PI/4;
                 delay(100);
           }
         if(key=='d'){
           angleTG1=angleTG1-PI/4;
           delay(100);
         }
  } 
  if((dist(posxP,posyP,mouseX,mouseY)<20)&&(keyPressed)){
    if (key== 'a') {
      if(angleP==PI){
        angleP=0;
      }else{
        angleP = angleP + PI/4;
        delay(100);
      }
    }
    if (key== 'd') {
      if(angleP==PI){
        angleP=0;
      }else{
        angleP = angleP + PI/4;
        delay(100);
      }
    }
  }
   if((dist(posxTG2,posyTG2,mouseX,mouseY)<20)&&(keyPressed)){
       if(key=='a'){
            angleTG2=angleTG2+radians(45);
            delay(100);
       }
      if(key=='d'){
         angleTG2=angleTG2-radians(45);
         delay(100);
      }
  }
  if((dist(posxTM,posyTM,mouseX,mouseY)<20)&&(keyPressed)){
       if(key=='a'){
            angleTM=angleTM+radians(45);
            delay(100);
       }
      if(key=='d'){
         angleTM=angleTM-radians(45);
         delay(100);
      }    
  }
  if((dist(posxTP1,posyTP1,mouseX,mouseY)<20)&&(keyPressed)){
       if(key=='a'){
            angleTP1=angleTP1+radians(45);
            delay(100);
       }
      if(key=='d'){
         angleTP1=angleTP1-radians(45);
         delay(100);
      }
  } 
  if((dist(posxTP2,posyTP2,mouseX,mouseY)<20)&&(keyPressed)){
       if(key=='a'){
            angleTP2=angleTP2+radians(45);
            delay(100);
       }
      if(key=='d'){
         angleTP2=angleTP2-radians(45);
         delay(100);
      }
  }
  if((dist(posxC,posyC,mouseX,mouseY)<20)&&(keyPressed)){
     if (key== 'a') {
      if(angleC==PI/2){
        angleC=0;
      }else{
        angleC = angleC + PI/4;
        delay(100);
      }
    }
    if (key== 'd') {
      if(angleC==PI/2){
        angleC=0;
      }else{
        angleC = angleC + PI/4;
        delay(100);
      }
    }
  }
}
void PintarTrianguloGrande1(){
  keyReleased();
  if((dist(posxTG1,posyTG1,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxTG1=mouseX;
  posyTG1=mouseY;
  
  
  push();
  translate(posxTG1,posyTG1);
  rotate(angleTG1);
  triangle(0,70,120,-50,-120,-50);
  fill(200,45,65);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxTG1,posyTG1);
    rotate(angleTG1);
    triangle(0,70,120,-50,-120,-50);
    fill(200,45,65);
    noStroke();
    circle(0,0,20);
    pop();
  }
} 

void PintarParalelogramo(){
  if((dist(posxP,posyP,mouseX,mouseY)<20)&&(mousePressed)){
    posxP=mouseX;
    posyP=mouseY;
  
 
  push();
  translate(posxP,posyP);
  rotate(angleP);
  quad(-30,-90,-30,30,30,90,30,-30);
  fill(70,20,190);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxP,posyP);
    rotate(angleP);
    quad(-30,-90,-30,30,30,90,30,-30);
    fill(70,20,190);
    noStroke();
    circle(0,0,20);
    pop();
  }
}  

void PintarTrianguloGrande2(){
  keyReleased();
  if((dist(posxTG2,posyTG2,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxTG2=mouseX;
  posyTG2=mouseY;
  
 
  push();
  translate(posxTG2,posyTG2);
  rotate(angleTG2);
  triangle(-70,0,50,-120,50,120);
  fill(40,128,40);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxTG2,posyTG2);
    rotate(angleTG2);
    triangle(-70,0,50,-120,50,120);
    fill(40,128,40);
    noStroke();
    circle(0,0,20);
    pop();
  }
}      

void PintarTrianguloMediano(){
  keyReleased();
  if((dist(posxTM,posyTM,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxTM=mouseX;
  posyTM=mouseY;
  

  push();
  translate(posxTM,posyTM);
  rotate(angleTM);
  triangle(-40,40,80,40,-40,-80);
  fill(200,0,100);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxTM,posyTM);
    rotate(angleTM);
    triangle(-40,40,80,40,-40,-80);
    fill(200,0,100);
    noStroke();
    circle(0,0,20);
    pop();
  }
}      

void PintarTrianguloPequeno1(){
  keyReleased();
  if((dist(posxTP1,posyTP1,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxTP1=mouseX;
  posyTP1=mouseY;
  
  push();
  translate(posxTP1,posyTP1);
  rotate(angleTP1);
  triangle(60,20,0,-40,-60,20);
  fill(200,200,0);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxTP1,posyTP1);
    rotate(angleTP1);
    triangle(60,20,0,-40,-60,20);
    fill(200,200,0);
    noStroke();
    circle(0,0,20);
    pop();
  } 
}     

void PintarTrianguloPequeno2(){
  keyReleased();
  if((dist(posxTP2,posyTP2,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxTP2=mouseX;
  posyTP2=mouseY;
  

  push();
  translate(posxTP2,posyTP2);
  rotate(angleTP2);
  triangle(60,20,0,-40,-60,20);
  fill(237,145,33);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
     push();
     translate(posxTP2,posyTP2);
     rotate(angleTP2);
     triangle(60,20,0,-40,-60,20);
     fill(237,145,33);
     noStroke();
     circle(0,0,20);
     pop();
  } 
}

void PintarCuadrado(){
  keyReleased();
  if((dist(posxC,posyC,mouseX,mouseY)<20)&&(mousePressed)){
  
  posxC=mouseX;
  posyC=mouseY;
  
  push();
 
  fill(255,255,0);
  PintarTrianguloPequeno1();
  fill(255,112,40);
  PintarTrianguloPequeno2();
  fill(100,60,60);
  translate(posxC,posyC);
  rotate(angleC);
  quad(0,-60,60,0,0,60,-60,0);
  fill(90,90,90);
  noStroke();
  circle(0,0,20);
  pop();
  }else{
    push();
    translate(posxC, posyC);
    rotate(angleC);
    quad(0,-60,60,0,0,60,-60,0);
    fill(90,90,90);
    noStroke();
    circle(0,0,20);
    pop();
  } 
}  

void GanoJuego(){
  if((dist(posxTG1, posyTG1,720,550)<5 || dist(posxTG1, posyTG1,680,430)<5) && dist(posxP,posyP,798,438)<5 && (dist(posxTG2, posyTG2,720,550)<5 || dist(posxTG2, posyTG2,680,430)<5) && dist(posxC,posyC,756,351)<5 && dist(posxTM,posyTM,640,520)<5 && (dist(posxTP1, posyTP1,820,540)<5 || dist(posxTP1, posyTP1,780,500)<5) && (dist(posxTP2, posyTP2,820,540)<5 || dist(posxTP2, posyTP2,780,500)<5) ){
    gano=true;
    background(255);
    textSize(50);
    text("Felicidades, lo Lograste!", 50, 50);
  }else{
        if((dist(posxTG1, posyTG1,720,550)<5 || dist(posxTG1, posyTG1,680,430)<5) && dist(posxP,posyP,798,438)<5 && (dist(posxTG2, posyTG2,720,550)<5 || dist(posxTG2, posyTG2,680,430)<5) && dist(posxC,posyC,756,351)<5 && dist(posxTM,posyTM,800,520)<5 && (dist(posxTP1, posyTP1,620,540)<5 || dist(posxTP1, posyTP1,660,500)<5) && (dist(posxTP2, posyTP2,620,540)<5 || dist(posxTP2, posyTP2,660,500)<5) ){
          gano=true;
          background(255);
          textSize(50);
          text("Felicidades, lo Lograste!", 50, 50);
        }else{
           if((dist(posxTG1, posyTG1,720,530)<5 || dist(posxTG1, posyTG1,680,430)<5) && dist(posxP,posyP,798,438)<5 && (dist(posxTG2, posyTG2,720,550)<5 || dist(posxTG2, posyTG2,680,430)<5) && dist(posxC,posyC,756,351)<5 && dist(posxTM,posyTM,800,560)<5 && (dist(posxTP1, posyTP1,660,580)<5 || dist(posxTP1, posyTP1,620,540)<5) && (dist(posxTP2, posyTP2,660,580)<5 || dist(posxTP2, posyTP2,620,540)<5) ){ 
             gano=true;
             background(255);
             textSize(50);
             text("Felicidades, lo Lograste!", 50, 50);
           }else{
            if((dist(posxTG1, posyTG1,720,530)<5 || dist(posxTG1, posyTG1,680,430)<5) && dist(posxP,posyP,798,438)<5 && (dist(posxTG2, posyTG2,720,550)<5 || dist(posxTG2, posyTG2,680,430)<5) && dist(posxC,posyC,756,351)<5 && dist(posxTM,posyTM,640,560)<5 && (dist(posxTP1, posyTP1,780,580)<5 || dist(posxTP1, posyTP1,820,540)<5) && (dist(posxTP2, posyTP2,780,580)<5 || dist(posxTP2, posyTP2,820,540)<5) ){ 
             gano=true;
             background(255);
             textSize(50);
             text("Felicidades, lo Lograste!", 50, 50);
            }else{
              gano=false;
              fill(255, 255, 255);
              textSize(50);
                    text("Revisa el Tangram,Crack", 50, 50);
                    
                  }
                }
              }
            }
           }
        
     
void setup(){
  size(900,900,P2D);
}

void draw(){
  background(0,10,5);
 
  
  fill(255);
  stroke(0);
  noStroke();
  beginShape();
  vertex(600,600);
  vertex(840,600);
  vertex(840,480);
  vertex(882,480);
  vertex(798,393);
  vertex(798,308);
  vertex(713,308);
  vertex(713,393);
  vertex(680,360);
  vertex(560,480);
  vertex(600,480);
  endShape(CLOSE);
  fill(255,112,40);
  PintarTrianguloPequeno2();
  fill(255,255,0);
  PintarTrianguloPequeno1();
  fill(100,60,60);
  PintarCuadrado();
  fill(255,0,128);
  PintarTrianguloMediano();
  fill(210,50,60);
  PintarTrianguloGrande1();
  fill(0,128,0);
  PintarTrianguloGrande2();
  fill(80,20,170);
  PintarParalelogramo();
  GanoJuego();
  
   fill(10);
  
  /*/Triangulo mediano
  circle(640,520,20);
  circle(800,520,20);
  circle(800,560,20);
  circle(640,560,20);
  
  //Triangulo grande
  circle(680,430,20);
  
  //Triangulo grande
  circle(720,550,20);
  circle(720,530,20);
  
  //triangulo pequeno2
  circle(780,500,20);
  circle(620,540,20);
  circle(660,580,20);
  circle(780,580,20);
  
  //Triangulo pequeno1
  circle(820,540,20);
  circle(660,500,20);
  circle(620,540,20);
  circle(820,540,20);
  
  //paralelogramo
  circle(798,438,20);
  
  //cuadrado
 
  circle(756,351,20);
*/}
