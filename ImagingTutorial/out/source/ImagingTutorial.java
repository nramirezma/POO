import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ImagingTutorial extends PApplet {

PImage image;

public void setup() {
  
  image = loadImage("lenna.png");
}

public void draw() {
  background(0);
  // width y height
  image(image, 0, 0);
}

public void complementary() {
  // 1. cargar el arreglo de pixeles en pixels[]
  image.loadPixels();
  for (int i = 0; i < image.width * image.height; i++) {
    int c = image.pixels[i];
    // 2. leer: obtener las canales de color
    image.pixels[i] = color(255 - red(c), 255 - green(c), 255 - blue(c));
  }
  // 3. Actualizar
  image.updatePixels();
}

public void keyPressed() {
  if (key == 'c')
    complementary();
}
  public void settings() {  size(512, 512); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ImagingTutorial" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
