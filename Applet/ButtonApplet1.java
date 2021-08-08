import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="ButtonApplet1.class" width="500" height="500">
</applet>
*/
public class ButtonApplet1 extends Applet implements ActionListener
{
  Button btn1,btn2,btn3;
  String msg; 
  public void init()
  {
     btn1 = new Button("First");
     add(btn1);
     btn2 = new Button("Second");
     add(btn2);
     btn3 = new Button("Third");
     add(btn3);

     btn1.addActionListener(this);
     btn2.addActionListener(this);
     btn3.addActionListener(this);
     msg="";
  }
  public void paint(Graphics g)
  {
     g.drawString(msg,100,300);
  }
  public void actionPerformed(ActionEvent ae)
  {
     msg=ae.getActionCommand()+" Button Clicked";
     repaint();    
  }
}