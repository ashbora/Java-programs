 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
 <applet code="CheckApplet1.class" width=500 height=500>
 </applet>
*/
public class CheckApplet1 extends Applet implements ItemListener
{
     Checkbox c1,c2,c3,c4;
     public void init()
     {
         c1 = new Checkbox("Windows 7");
         add(c1);
         c1.addItemListener(this);
         c2 = new Checkbox("Windows 8");
         add(c2);
         c2.addItemListener(this);
         c3 = new Checkbox("Solaris");
         add(c3);
         c3.addItemListener(this);
         c4 = new Checkbox("Linux");
         add(c4);
         c4.addItemListener(this);
     }
     public void paint(Graphics g)
     {
        g.drawString(c1.getLabel() +":"+c1.getState(),100,100);
        g.drawString(c2.getLabel() +":"+c2.getState(),100,130);
        g.drawString(c3.getLabel() +":"+c3.getState(),100,160);
        g.drawString(c4.getLabel() +":"+c4.getState(),100,190);
     }
     public void itemStateChanged(ItemEvent ie)
     {
          repaint();   
     }
}