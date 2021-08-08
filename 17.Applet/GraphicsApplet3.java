 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet3.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet3 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawRoundRect(10,50,280,150,30,30);   
         g.drawRoundRect(350,25,200,200,45,20);   
         g.setColor(Color.red);
         g.fillRoundRect(50,275,200,200,40,40);   
         g.setColor(Color.orange);
         g.fillRoundRect(310,300,280,150,10,50);     
     }
 }