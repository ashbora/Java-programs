 import java.awt.*;
 import java.applet.*;
/*
<applet code="FontMetricsApplet3.class" width=500 height=500>
</applet>
*/
public class FontMetricsApplet3 extends Applet
{
    int w=0,h=0,y=0;
    public void init()
    {
          Font f = new Font("Comic SansSerif",Font.BOLD|Font.ITALIC,32);
          setFont(f);      
    }
   public void paint(Graphics g)
   { 
        y=0;
        Dimension d = this.getSize();  
        w = d.width;
        h = d.height;
        String txt1,txt2,txt3;
        txt1 = "Java Language";
        txt2 = "Sun MicroSystem";
        txt3 = "James Gosling";
        printLine(txt1,w,h,g); 
        printLine(txt2,w,h,g); 
        printLine(txt3,w,h,g); 
   }
   void printLine(String str,int w, int h, Graphics g)
   {
       FontMetrics fm = g.getFontMetrics();
       int x = (w - fm.stringWidth(str))/2;              //centered aligned
       y = y + fm.getHeight();   
       g.drawString(str,x,y);   
   }
}
