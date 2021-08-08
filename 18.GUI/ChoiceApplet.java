 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
  <applet code="ChoiceApplet.class" width=500 height=500>
  </applet>
*/
public class ChoiceApplet extends Applet implements ItemListener
{
     Choice chlist;
     public void init()
     {
          chlist = new Choice();
          add(chlist);
          chlist.add("Internet Explorer");
          chlist.add("Opera");
          chlist.add("FireFox");
          chlist.add("Chrome");
          chlist.add("Safari");
          chlist.add("Mosaic");
          chlist.select(3);
          chlist.addItemListener(this);
     }
     public void paint(Graphics g)
     {
          g.drawString("Total       :"+chlist.getItemCount(),100,100);
          g.drawString("Selected  :"+chlist.getSelectedItem(),100,150);
          g.drawString("Index       :"+chlist.getSelectedIndex(),100,200); 
     }
   public void itemStateChanged(ItemEvent ie)
   {
       repaint();
   }
}