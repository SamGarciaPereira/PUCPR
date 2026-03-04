void carro(int xp, int yp){
  line(50, 450, 123, 450); //line 10
  line(50, 450, 50, 400); //line 1
  triangle(50, 400, 50, 380, 100, 400); //rabera
  line(50, 400, 180, 400); //line 2
  quad(180, 400, 215, 370, 345, 370, 380, 400); //vidro
  line(350, 400, 500, 400); //line 6
  line(500, 400, 500, 450); //line 7
  line(500, 450, 470, 450); //line 8
  //arc(200, 200, 200, 200, 0, PI); 
  arc(150, 450, 50, 50, 0, PI, OPEN); //roda traseira
  ellipse(443, 450, 50, 50); //roda dianteira  
  //rect(110, 430, 50, 10 / 2, 5);
  

  
  
}
