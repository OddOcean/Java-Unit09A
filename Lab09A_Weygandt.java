import java.awt.*;
import javax.swing.JFrame;

public class Lab09A_Weygandt extends Canvas{
  public static void main(String[] args){
    JFrame frame = new JFrame();//creates canvas for drawing VVV
    Canvas canvas = new Lab09A_Weygandt();
    canvas.setSize(400, 800);
    canvas.setBackground(Color.WHITE);
    frame.add(canvas);
    frame.pack();
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  public int rand(double num){//return random number from 0 - num
    int rand = (int)Math.round(Math.random()*num);
    return rand;
  }
  
  public void paint(Graphics g){//draws on of the three randomized heads every 300 miliseconds
    while (true){
      int randNum = rand(2);
      g.setColor(Color.WHITE);
      g.fillRect(0, 0, 400, 800);
      if (randNum == 0){
        Head head = new Head();
        head.drawHead(g);
      }else if (randNum == 1){
        HeadColors head = new HeadColors();
        head.drawHead(g);
      }else if (randNum == 2){
        RandomHeadColors head = new RandomHeadColors();
        head.drawHead(g);
      }
      delay(300);
    }
  }
  
  public static void delay(int delay){//borrowed this from you
    int delaytime = delay;
    long startDelay = System.currentTimeMillis(); 
    long endDelay = 0;

    while (endDelay - startDelay < delaytime)//waits input milliseconds before breaking
         endDelay = System.currentTimeMillis();
  }
}