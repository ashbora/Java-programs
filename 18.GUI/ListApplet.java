 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*; 
 /*
  <applet code="ListApplet.class" width=500 height=500>
  </applet>
 */
 public class ListApplet extends Applet implements ItemListener,ActionListener
 {
     List list;
     String dblsel=""; 
     public void init()
     {
          list = new List(6);
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
          list.addActionListener(this);
     } 
     public void paint(Graphics g)
     {
         g.drawString("Total items :"+list.getItemCount(),100,130);
         g.drawString("Sel.  item    :"+list.getSelectedItem(),100,160);
         g.drawString("Sel.  index  :"+list.getSelectedIndex(),100,190);
         g.drawString("Dbl.Sel.      :"+dblsel,100,220);
     }
     public void itemStateChanged(ItemEvent ie)
    {
         repaint();
    }
    public void actionPerformed(ActionEvent ae)
    {
         dblsel = list.getSelectedItem()+"("+list.getSelectedIndex()+")";
         repaint();
    } 
 }