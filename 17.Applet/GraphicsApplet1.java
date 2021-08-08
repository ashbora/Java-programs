 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet1.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet1 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawLine(50,100,500,450);   
         g.drawLine(300,0,300,500);
         g.drawLine(0,250,600,250);
     }
 }