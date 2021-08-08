 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet5.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet5 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawArc(10,50,280,150,45,180);   
         g.drawArc(350,25,200,200,270,120);   
         g.setColor(Color.red);
         g.fillArc(50,275,200,200,180,75);   
         g.setColor(Color.orange);
         g.fillArc(310,300,280,150,0,270);     
     }
 }