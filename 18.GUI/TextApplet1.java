 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
 <applet code="TextApplet1.class" width=500 height=500>
 </applet>
*/
public class TextApplet1 extends Applet implements ActionListener
{
     TextField t;
     public void init()
     {
            t = new TextField(30);
            t.setEchoChar('#');
            add(t);
            t.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
         String txt=t.getText();
         g.drawString("Your text :"+txt,100,100);
    }
}