 import java.awt.*;
 import java.applet.*;
/*
<applet code="MyApplet1.class" width="300" height="300">
</applet>
*/
 public class MyApplet1 extends Applet
 {
    public void init()
     {
           setBackground(Color.red);
           setForeground(Color.yellow);
     }

     public void paint(Graphics g)
     {
         g.drawString("Testing Applet colors",50,100);   
     }
 }