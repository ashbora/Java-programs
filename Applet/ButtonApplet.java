import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="ButtonApplet.class" width="500" height="500">
</applet>
*/
public class ButtonApplet extends Applet implements ActionListener
{
  Button btn;
  String msg; 
  int cnt;
  public void init()
  {
     btn = new Button("Click Me");
     add(btn);
     btn.addActionListener(this);
     msg="";
     cnt=0;
  }
  public void paint(Graphics g)
  {
     g.drawString(msg,100,300);
  }
  public void actionPerformed(ActionEvent ae)
  {
     cnt++;
     msg="Button Clicked "+cnt+" times";
     repaint();    
  }
}