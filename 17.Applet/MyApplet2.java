 import java.awt.*;
 import java.applet.*;
/*
<applet code="MyApplet2.class" width="300" height="300">
</applet>
*/
 public class MyApplet2 extends Applet
 {
     public void paint(Graphics g)
     {
         g.drawString("Text in document window",50,100);
         showStatus("Text in status area of browser");   
     }
 }