 import java.awt.*;
 import java.applet.*;
/*
<applet code="ColorApplet3.class" width="600" height="500">
</applet>
*/
 public class ColorApplet3 extends Applet
 {
      public void paint(Graphics g)
     {
        int newclr = (0x00000000 |255<<16 |0<<8 |255);
        Color clr =new Color(newclr); 
        g.setColor(clr);
        g.fillRect(50,50,500,400);
      }
 }