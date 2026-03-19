void parabola(){
  for(int x=-30; x<31; x++){
    float y = pow(x,2);
    circle(x * 10, y, 10);
  }
}

void setup(){
  size(500, 500);
}

void draw(){
  translate(width/2, height/2);
 parabola(); 
}
