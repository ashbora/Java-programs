 import java.awt.*;
 import java.applet.*;
/*
<applet code="ColorApplet1.class" width="600" height="500">
</applet>
*/
 public class ColorApplet1 extends Applet
 {
     
     public void paint(Graphics g)
     { 
          int a[]={255,210,150,110,60,20};
          int b[]={255,210,150,110,60,20};
          int c[]={255,210,150,110,60,20};
          int r=10,col;
          for(int i=0;i<a.length;i++)
          {
               for(int j=0;j<b.length;j++)
               { col=10;
                   for(int k=0;k<c.length;k++)
                   {      
                       Color clr = new Color(a[i],b[j],c[k]);
                       g.setColor(clr);
                       g.fillOval(col,r,20,20);
                       col+=30;
                   }
                r+=30;
               }
          }
      }
 }