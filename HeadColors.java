import java.awt.*;

public class HeadColors extends Head{//child of Head class, changes dark coloring to more realistic colors
  
  public void HeadColors(){//headColors constructor
    super.shape = 0;
    super.skin = 0;
    super.hair = 0;
  }
  
  public int rand(double num){//inherits rand method
    return super.rand(num);
  }
  
  public void skinColor(Graphics g){//overrides parent method and sets drawing color as one of 3 random colors
    if (skin == 0){
      g.setColor(new Color(245, 216, 199));
    }else if (skin == 1){
      g.setColor(new Color(200, 135, 70));
    }else if (skin == 2){
      g.setColor(new Color(130, 84, 39));
    }
  }
  
  public void neckColor(Graphics g){//overrides parent method and sets drawing color as one of 3 random colors
    if (skin == 0){
      g.setColor(new Color(201, 183, 161));
    }else if (skin == 1){
      g.setColor(new Color(161, 110, 59));
    }else if (skin == 2){
      g.setColor(new Color(92, 61, 30));
    }
  }
  
  public void hairColor(Graphics g){//overrides parent method and sets drawing color as one of 5 random colors
    int color = rand(4);
    if (color == 0){
      g.setColor(new Color(224, 86, 31));
    }else if (color == 1){
      g.setColor(new Color(166, 92, 35));
    }else if (color == 2){
      g.setColor(new Color(212, 145, 63));
    }else if (color == 3){
      g.setColor(new Color(115, 60, 6));
    }else if (color == 4){
      g.setColor(new Color(79, 39, 2));
    }
  }
  
  public void drawHead(Graphics g){//inherits drawHead method
    super.drawHead(g);
  }
  
}//closes class