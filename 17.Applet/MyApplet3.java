 import java.awt.*;
 import java.applet.*;
 import java.net.*;
/*
<applet code="MyApplet3.class" width="300" height="300">
</applet>
*/
 public class MyApplet3 extends Applet
 {
     public void paint(Graphics g)
     {
        URL docurl = getDocumentBase();
        URL codeurl = getCodeBase(); 
        String msg1 = "HTML page location :" + docurl.toString();
        String msg2 = "Applet code location :"+ codeurl.toString(); 
        g.drawString(msg1,50,100);
        g.drawString(msg2,50,150);
     }
 }