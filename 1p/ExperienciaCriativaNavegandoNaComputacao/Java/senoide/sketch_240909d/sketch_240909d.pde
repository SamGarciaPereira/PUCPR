void senoide(){ 
  for (float x = -10*PI; x<10*PI; x = x +PI/20){
  float y = sin(x);
  circle(x*10, y*100, 5);
  }
}

void setup(){
size(500, 500);
}

void draw(){
  translate(width/2, height/2);
  senoide();
}
