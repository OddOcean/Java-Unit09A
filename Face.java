import java.awt.*;

public class Face{
   public Color eyeColor;
	public int eyes;
  
	public void Face(){//face constructor
    eyes = 0;
	}

  public int rand(double num){//returns random number from 0 - num
    int rand = (int)Math.round(Math.random()*num);
    return rand;
  }

  public void drawEyes(Graphics g){//draws a random set of eyes when called
    eyes = rand(4);
    eyeColor(g);
    if (eyes == 0){//regular eyes
      g.fillOval(168, 365, 15, 15);
      g.fillOval(218, 365, 15, 15);
    }else if (eyes == 1){//happy open eyes
      g.fillArc(168, 365, 15, 15, 0, 180);
      g.fillArc(218, 365, 15, 15, 0, 180);
    }else if (eyes == 2){//sad open eyes
      g.fillArc(168, 365, 15, 15, 180, 180);
      g.fillArc(218, 365, 15, 15, 180, 180);
    }else if (eyes == 3){//sad closed eyes
      g.drawArc(168, 365, 15, 15, 180, 180);
      g.drawArc(168, 366, 15, 15, 180, 180);
      g.drawArc(218, 365, 15, 15, 180, 180);
      g.drawArc(218, 366, 15, 15, 180, 180);
    }else if (eyes == 4){//happy closed eyes
      g.drawArc(168, 365, 15, 15, 0, 180);
      g.drawArc(168, 366, 15, 15, 0, 180);
      g.drawArc(218, 365, 15, 15, 0, 180);
      g.drawArc(218, 366, 15, 15, 0, 180);
    }
  }
  
  public void eyeColor(Graphics g){//sets randomly one of 5 colors as the drawing color
    int color = rand(4);
    if (color == 0){
      eyeColor = new Color(15, 133, 166);
    }else if (color == 1){
      eyeColor = new Color(56, 23, 0);
    }else if (color == 2){
      eyeColor = new Color(4, 145, 58);
    }else if (color == 3){
      eyeColor = new Color(186, 25, 0);
    }else if (color == 4){
      eyeColor = new Color(86, 0, 184);
    }
    g.setColor(eyeColor);
  }
}//closes class