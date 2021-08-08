import java.applet.*;
import java.awt.*;
/*
<applet code="LabelApplet.class" width="500" height="500">
</applet>
*/
public class LabelApplet extends Applet
{
  Label l1; 
  public void init()
  {
    setLayout(null);
    l1 = new Label("Elegant IT",Label.CENTER);
    l1.setBackground(Color.cyan);
    l1.setForeground(Color.red);
   // l1.setLocation(20,100);
   // l1.setSize(460,60);
    l1.setBounds(20,100,460,60);
    l1.setFont(new Font("Times New Roman",Font.BOLD|Font.ITALIC,32));
    add(l1);
  }
}