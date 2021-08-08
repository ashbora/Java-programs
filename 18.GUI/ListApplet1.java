 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*; 
 /*
  <applet code="ListApplet1.class" width=500 height=500>
  </applet>
 */
 public class ListApplet1 extends Applet implements ItemListener
 {
     List list;
     String sel=""; 
     public void init()
     {
          list = new List(6,true);   //multi-selectable list
          add(list);
          list.add("Windows 7");
          list.add("Windows 8");
          list.add("Linux");
          list.add("MS-DOS");
          list.add("Unix");
          list.add("Chrome OS");
          list.add("Solaris");
          list.add("Warp",2);
          list.addItemListener(this);       
     } 
     public void paint(Graphics g)
     {
         g.drawString("Selected  items :"+sel,10,160);
     }
     public void itemStateChanged(ItemEvent ie)
    {
        String selitm[] = list.getSelectedItems();
        sel ="";
        for(int i=0;i<selitm.length;i++)
            sel = sel+selitm[i]+";";
         repaint();
    } 
 }