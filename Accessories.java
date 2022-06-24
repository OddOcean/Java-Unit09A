import java.awt.*;

public class Accessories{

	private int glasses;
	private int hat;
  
	public void Accessories(){
    glasses = 0;
    hat = 0;
	}

  public int rand(double num){//returns random number from 0 - num
    int rand = (int)Math.round(Math.random()*num);
    return rand;
  }

  public void drawGlasses(Graphics g){//has a chance to draw glasses when called
    glasses = rand(4);
    if (glasses == 0){//sick shades
      g.setColor(Color.BLACK);
      g.fillArc(150, 345, 51, 40, 180, 180);
      g.fillArc(199, 345, 51, 40, 180, 180);
    }
  }
  
  public void drawHat(Graphics g){//has a chance to draw a tophat when called
    hat = rand(4);
    if (hat == 0){//top hat
      int [] hatX = {200, 250, 280, 200, 120, 150};
      int [] hatY = {320, 330, 320, 310, 320, 330};
      g.setColor(Color.BLACK);
      g.fillPolygon(hatX, hatY, 6);
      g.fillRect(150, 240, 100, 80);
    }
  }
}//closes class