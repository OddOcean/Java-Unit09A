import java.awt.*;

public class RandomHeadColors extends HeadColors{//child of HeadColors, changes colors to random colors
  
  public void RandomHeadColors(){
    super.shape = 0;
    super.skin = 0;
    super.hair = 0;
  }
  
  public int rand(double num){//inherits rand method
    return super.rand(num);
  }
  
  public void skinColor(Graphics g){//new skinColor method returns random color
    g.setColor(new Color(rand(255), rand(255), rand(255)));
  }
  
  public void neckColor(Graphics g){//new neckColor method returns random color
    g.setColor(new Color(rand(255), rand(255), rand(255)));
  }
  
  public void hairColor(Graphics g){//new hairColor method returns random color
    g.setColor(new Color(rand(255), rand(255), rand(255)));
  }
  
  public void drawHead(Graphics g){//inherits drawHead method
    super.drawHead(g);
  }
  
}//closes class