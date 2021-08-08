 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet4.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet4 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawOval(10,50,280,150);   
         g.drawOval(350,25,200,200);   
         g.setColor(Color.red);
         g.fillOval(50,275,200,200);   
         g.setColor(Color.orange);
         g.fillOval(310,300,280,150);     
     }
 }