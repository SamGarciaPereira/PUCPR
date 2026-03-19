PImage img1;
PImage img2;
PImage img3;
PImage img4;

int xButton1=200, yButton1=500, lButton1=100, aButton1=50, 
    xButton2=450, yButton2=500, lButton2=100, aButton2=50,
    xButton3=700, yButton3=500, lButton3=100, aButton3=50;

int xp = 250;

void setup(){
  size(1000, 1000);
  img1 = loadImage("meci.png");
  img2 = loadImage("cr7.png");
  img3 = loadImage("ney.png");
  img4 = loadImage("null.png");
}

void draw(){
  rect  (xButton1, yButton1, lButton1, aButton1);
  rect (xButton2, yButton2, lButton2, aButton2);
  rect (xButton3, yButton3, lButton3, aButton3);
}

void mousePressed(){
  if(mouseX>xButton1 && mouseX<xButton1+lButton1 && mouseY>yButton1 && mouseY<yButton1+aButton1)
    image(img1, xp, 0, 350, 350);
  else if(mouseX>xButton2 && mouseX<xButton2+lButton2 && mouseY>yButton2 && mouseY<yButton2+aButton2)
    image(img2, xp, 0, 350, 350);
   else if(mouseX>xButton3 && mouseX<xButton3+lButton3 && mouseY>yButton3 && mouseY<yButton3+aButton3)
     image(img3, xp, 0, 350, 350);
     else
      image(img4, xp, 0, 350, 350);
}
