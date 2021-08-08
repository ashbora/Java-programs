 import java.awt.*;
 import java.applet.*;
/*
<applet code="ColorApplet2.class" width="1400" height="800">
</applet>
*/
 public class ColorApplet2 extends Applet
 {
      public void paint(Graphics g)
     { 
          int r=2,col;
          for(int i=255;i>=0;i--)
          {
               for(int j=255;j>=0;j--)
               { col=2;
                   for(int k=255;k>=0;k--)
                   {      
                       Color clr = new Color(i,j,k);
                       g.setColor(clr);
                       g.fillOval(col,r,5,5);
                       col+=6;
                   }
                r+=6;
               }
          }
      }
 }