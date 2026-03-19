PImage deserto;
PImage pradaria;
PImage floresta_tropical;
PImage floresta_temperada;
PImage savana;
PImage tundra;
PImage taiga;

void img_biomas(){
  deserto = loadImage("deserto.jpeg");
  pradaria = loadImage("pradaria.jpeg");
  floresta_tropical = loadImage("floresta-tropical.jpeg");
  floresta_temperada = loadImage("floresta-temperada.jpeg");
  savana = loadImage("savana.jpeg");
  tundra = loadImage("tundra.jpeg");
  taiga = loadImage("taiga.jpeg");
  
}

int xBtnDeserto = 150, yBtnDeserto = 550, lBtnDeserto = 100, aBtnDeserto = 50,
    xBtnPradaria = 300, yBtnPradaria = 550, lBtnPradaria = 100, aBtnPradaria = 50,
    xBtnFlorestaTemperada = 450, yBtnFlorestaTemperada = 550, lBtnFlorestaTemperada = 100, aBtnFlorestaTemperada = 50,
    xBtnFlorestaTropical = 600, yBtnFlorestaTropical = 550, lBtnFlorestaTropical = 100, aBtnFlorestaTropical = 50,
    xBtnSavana = 750, yBtnSavana = 550, lBtnSavana = 100, aBtnSavana = 50,
    xBtnTundra = 900, yBtnTundra = 550, lBtnTundra = 100, aBtnTundra = 50,
    xBtnTaiga = 1050, yBtnTaiga = 550, lBtnTaiga = 100, aBtnTaiga = 50;
    
void mousePressed(){
if(mouseX>xBtnDeserto && mouseX<xBtnDeserto+lBtnDeserto && mouseY>yBtnDeserto && mouseY<yBtnDeserto+aBtnDeserto){
    image(deserto, xp, yp, 500, 350);
   }else if(mouseX>xBtnPradaria && mouseX<xBtnPradaria+lBtnPradaria && mouseY>yBtnPradaria && mouseY<yBtnPradaria+aBtnPradaria){
    image(pradaria, xp, yp, 500, 350);
  }else if(mouseX>xBtnFlorestaTemperada && mouseX<xBtnFlorestaTemperada+lBtnFlorestaTemperada && mouseY>yBtnFlorestaTemperada && mouseY<yBtnFlorestaTemperada+aBtnFlorestaTemperada){
     image(floresta_temperada, xp, yp, 500, 350);
  }else if(mouseX>xBtnFlorestaTropical && mouseX<xBtnFlorestaTropical+lBtnFlorestaTropical && mouseY>yBtnFlorestaTropical && mouseY<yBtnFlorestaTropical+aBtnFlorestaTropical){
     image(floresta_tropical, xp, yp, 500, 350);
  }else if(mouseX>xBtnSavana && mouseX<xBtnSavana+lBtnSavana && mouseY>yBtnSavana && mouseY<yBtnSavana+aBtnSavana){
     image(savana, xp, yp, 500, 350);
  }else if(mouseX>xBtnTundra && mouseX<xBtnTundra+lBtnTundra && mouseY>yBtnTundra && mouseY<yBtnTundra+aBtnTundra){
     image(tundra, xp, yp, 500, 350);
  }else if(mouseX>xBtnTaiga && mouseX<xBtnTaiga+lBtnTaiga && mouseY>yBtnTaiga && mouseY<yBtnTaiga+aBtnTaiga){
     image(taiga, xp, yp, 500, 350);
  }
}

void btn_biomas(){
  
   cp5 = new ControlP5(this);

  cp5.addButton("btn") 
     .setLabel("Deserto")
     .setPosition(150, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnPradaria") 
     .setLabel("Pradaria")     
     .setPosition(300, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnFlorestaTemperada") 
     .setLabel("Floresta Temperada")     
     .setPosition(450, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnFlorestaTropical") 
     .setLabel("Floresta Tropical")     
     .setPosition(600, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnSavana") 
     .setLabel("Savana")     
     .setPosition(750, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnTundra") 
     .setLabel("Tundra")     
     .setPosition(900, 550)        
     .setSize(100, 50);
     
  cp5 = new ControlP5(this);
  
    cp5.addButton("btnTaiga") 
     .setLabel("Taiga")     
     .setPosition(1050, 550)        
     .setSize(100, 50);  
}
