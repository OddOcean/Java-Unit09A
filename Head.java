import java.awt.*;

public class Head{
  
  public Accessories  accessories;
  public Face face;
  public int shape;
  public int skin;
  public int hair;
  
  public void Head(){//head constructor
    shape = 0;
    skin = 0;
    hair = 0;
  }

  public int rand(double num){//returns random number from 0 - num
    int rand = (int)Math.round(Math.random()*num);
    return rand;
  }
  
  public void headShape(Graphics g){//draws a head with random attributes when called
    shape = rand(2);//used to randomize the head shape and skin color VV
    skin = rand(2);
    
    neckColor(g);
    
    //draws neck
    g.fillRect(166, 400, 68, 80);
    
    //draws ears
    g.fillOval(140, 360, 20, 40);
    g.fillOval(240, 360, 20, 40);
    
    skinColor(g);
    
    g.fillOval(150, 300, 100, 100);//top half of the head
    //draws head with one of three random jaws
    if (shape == 0){//regular jaw
      int headX [] = {150, 250, 250, 215, 185, 150};
      int headY [] = {350, 350, 400, 440, 440, 400};
      g.fillPolygon(headX, headY, 6);
    }else if (shape == 1){//thin jaw
     int headX [] = {150, 250, 245, 210, 190, 155};
     int headY [] = {350, 350, 400, 445, 445, 400};
     g.fillPolygon(headX, headY, 6);
    }else if (shape == 2){//thick jaw
     int headX [] = {150, 250, 253, 220, 180, 147};
     int headY [] = {350, 350, 400, 440, 440, 400};
     g.fillPolygon(headX, headY, 6);
    }    
  }
  
  public void hairStyle(Graphics g){
    hair = rand(3);
    hairColor(g);
    if (hair == 0){//mohawk
      g.fillRect(185, 245, 30, 80);
      int [] mohawkX = {190, 210, 215, 185};
      int [] mohawkY = {240, 240, 245, 245};
      g.fillPolygon(mohawkX, mohawkY, 4);
    }else if (hair == 1){//bowl cut
      g.fillArc(145, 295, 110, 130, 0, 180);
    }else if (hair == 2){//that haircut that everyone has
      g.fillArc(145, 295, 110, 110, 20, 200);
      g.fillRect(242, 332, 10, 30);
    }else if (hair == 3){//square cut
      g.fillArc(145, 300, 110, 50, 0, 180);
      g.fillRect(145, 325, 15, 40);
      g.fillRect(240, 325, 15, 40);
    }
  }
  
  public void skinColor(Graphics g){//sets color to dark gray for skin
    g.setColor(Color.DARK_GRAY);
  }
  
  public void neckColor(Graphics g){//sets color to black for neck
    g.setColor(Color.BLACK);
  }
  
  public void hairColor(Graphics g){//sets color to black for hair
    g.setColor(Color.BLACK);
  }
  
  public void drawHead(Graphics g){//will draw the head and features when called
    headShape(g);
    hairStyle(g);
    
    face = new Face();//face object for drawing eyes
    face.drawEyes(g);
        
    accessories = new Accessories();//accessories object for drawing glasses and hat
    accessories.drawGlasses(g);
    accessories.drawHat(g);
  }
}//closes class