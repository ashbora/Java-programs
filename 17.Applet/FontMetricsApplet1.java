 import java.awt.*;
 import java.applet.*;
/*
<applet code="FontMetricsApplet1.class" width=500 height=500>
</applet>
*/
public class FontMetricsApplet1 extends Applet
{
    int x=0,y=0;
    public void init()
    {
          Font f = new Font("Comic SansSerif",Font.BOLD|Font.ITALIC,32);
          setFont(f);      
    }
   public void paint(Graphics g)
   { 
        String txt1,txt2,txt3;
        txt1 = "Java Language";
        txt2 = "Sun MicroSystem";
        txt3 = "James Gosling";
        printLine(txt1,g); 
        printLine(txt2,g); 
        printLine(txt3,g); 
   }
   void printLine(String str,Graphics g)
   {
       FontMetrics fm = g.getFontMetrics();
       x = 10;
       y = y + fm.getHeight()*2;    //double gap
       g.drawString(str,x,y);   
   }
}
