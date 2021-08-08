 import java.awt.*;
 import java.applet.*;
/*
<applet code="FontApplet2.class" width=500 height=500>
</applet>
*/
public class FontApplet2 extends Applet
{
    String msg="";
    public void init()
    {
          msg = "Font Testing Applet";
          Font f = new Font("Algerian",Font.BOLD|Font.ITALIC,32);
          setFont(f);      
    }
   public void paint(Graphics g)
   {
         g.drawString(msg,10,200);
   }
}
