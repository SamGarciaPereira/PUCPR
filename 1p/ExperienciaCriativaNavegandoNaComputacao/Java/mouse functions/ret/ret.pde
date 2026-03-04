int xb=150, yb=250, lb=100, ab=50;

void setup(){
  size(500, 500);
}

void draw(){
  rect(xb, yb, lb, ab);
}

void mousePressed(){
  if(mouseX>xb && mouseX<xb+lb && mouseY>yb && mouseY<yb+ab)
   fill(random(100,250), random(100,250), random(100,250));
  else
  fill(0);
}
