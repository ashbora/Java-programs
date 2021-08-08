 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
 <applet code="TextApplet.class" width=500 height=500>
 </applet>
*/
public class TextApplet extends Applet implements TextListener
{
     TextField t;
     public void init()
     {
            t = new TextField(30);
            add(t);
            t.addTextListener(this);
     }
     public void textValueChanged(TextEvent te)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
         int tc = t.getText().length(); 
         g.drawString("Total characters :"+tc,100,100);
    }
}