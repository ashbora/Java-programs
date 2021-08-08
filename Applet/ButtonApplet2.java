import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="ButtonApplet2.class" width="500" height="500">
</applet>
*/
public class ButtonApplet2 extends Applet implements ActionListener
{
  Button btn[];
  public void init()
  {
     String btnname[]={"Orange","Red","Magenta","Yellow","Cyan","Blue","Green"};
     btn = new Button[7];
     for(int i=0;i<btn.length;i++)
     {
         btn[i] = new Button(btnname[i]);
         add(btn[i]);
         btn[i].addActionListener(this);
     }
  }
  public void actionPerformed(ActionEvent ae)
  {
     String btnlabel = ae.getActionCommand();
     if(btnlabel.equals("Orange"))
        setBackground(Color.orange);
     else
     if(btnlabel.equals("Red"))
        setBackground(Color.red);
     else
     if(btnlabel.equals("Magenta"))
        setBackground(Color.magenta);
     else
     if(btnlabel.equals("Yellow"))
        setBackground(Color.yellow);
     else
     if(btnlabel.equals("Cyan"))
        setBackground(Color.cyan);
     else
     if(btnlabel.equals("Blue"))
        setBackground(Color.blue);
     else
     if(btnlabel.equals("Green"))
        setBackground(Color.green);
   }
}