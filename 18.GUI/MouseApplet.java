  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="MouseApplet.class" width=500 height=500>
 </applet>
*/
  public class MouseApplet extends Applet implements MouseListener
  {
     String msg="";
     public void init()
     {
         msg="Mouse Events Testing Applet";
         addMouseListener(this);
     }
     public void paint(Graphics g)
     {
        g.drawString(msg,50,200);    
     }
     public void mouseClicked(MouseEvent me) 
     {         
          msg = "Mouse button "+me.getButton() +" is clicked  at "+me.getX()+","+me.getY();
          repaint();
     }
     public void mouseEntered(MouseEvent me)
     {
          msg="Mouse is now inside of Applet";
          repaint();
     }
     public void mouseExited(MouseEvent me)
     {
         msg = "Mouse is out of Applet ";
         repaint();
     }
     public void mousePressed(MouseEvent me)
     {
          msg = "Mouse button "+me.getButton() +" is pressed  at "+me.getX()+","+me.getY();
          repaint();
     }
    public void mouseReleased(MouseEvent me)
    {
          msg = "Mouse button "+me.getButton() +" is released  at "+me.getX()+","+me.getY();
          repaint();
    } 
 }