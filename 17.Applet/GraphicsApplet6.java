 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet6.class" width="600" height="500">
</applet>
*/
 public class GraphicsApplet6 extends Applet
 {
     
     public void paint(Graphics g)
     {
         int x[] = {10,200,400,590,380,600,265,70};
         int y[] = {260,100,80,220,240,500,350,400};
       //  g.drawPolygon(x,y,8);   
         g.fillPolygon(x,y,8);
     }
 }