 import java.awt.*;
 import java.applet.*;
/*
<applet code="GraphicsApplet7.class" width="600" height="600">
</applet>
*/
 public class GraphicsApplet7 extends Applet
 {
     
     public void paint(Graphics g)
     { 
         int x[] = {250,600,30,550,250};
         int y[] = {50,600,200,200,570};
         g.setColor(Color.magenta);
        //g.drawPolygon(x,y,5);   
         g.fillPolygon(x,y,5);
     }
 }