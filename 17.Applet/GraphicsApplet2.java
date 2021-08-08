 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet2.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet2 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawRect(10,50,280,150);   
         g.drawRect(350,25,200,200);   
         g.setColor(Color.red);
         g.fillRect(50,275,200,200);   
         g.setColor(Color.orange);
         g.fillRect(310,300,280,150);     
     }
 }