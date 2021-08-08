 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
 <applet code="CheckApplet.class" width=500 height=500>
 </applet>
*/
public class CheckApplet extends Applet implements ItemListener
{
     Checkbox cb;
     String msg;
     public void init()
     {
         cb = new Checkbox("Testing",true);
         add(cb);
         cb.addItemListener(this);
     }
     public void paint(Graphics g)
     {
        msg = "Current state :"+ cb.getState();
        g.drawString(msg,100,100);
     }
     public void itemStateChanged(ItemEvent ie)
     {
          repaint();   
     }
}