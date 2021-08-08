 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;
 /* 
 <applet code="ButtonApplet1.class" width=500 height=500> 
 </applet>
 */
 public class ButtonApplet1 extends Applet implements ActionListener
 {
     String msg="";
     Button b1,b2,b3;
     public void init()
     {
         b1 = new Button("First");
         add(b1);
         b1.addActionListener(this);
         b2 = new Button("Second");
         add(b2);
         b2.addActionListener(this);
         b3 = new Button("Third");
         add(b3);
         b3.addActionListener(this);
     }
     public void paint(Graphics g)
     { 
        g.drawString(msg,50,200);
     }
     public void actionPerformed(ActionEvent ae)
     {
         String cmd = ae.getActionCommand();     
         msg = "You clicked "+cmd+" button";
         repaint();
     }
 }