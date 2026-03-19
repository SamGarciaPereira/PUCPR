PImage imagem;

int xp=0;

void setup(){
  imagem = loadImage("meci.png");
  size(500, 500);  
}

void draw(){
 image(imagem, xp, 0, 200, 200);
  
}
