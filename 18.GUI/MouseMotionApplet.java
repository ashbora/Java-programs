  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="MouseMotionApplet.class" width=500 height=500>
 </applet>
*/
  public class MouseMotionApplet extends Applet implements MouseMotionListener
  {
     String msg="";
     public void init()
     {
         msg="Mouse Events Testing Applet";
         addMouseMotionListener(this);
     }
     public void paint(Graphics g)
     {
        g.drawString(msg,50,200);    
     }
     public void mouseMoved(MouseEvent me) 
     {         
          msg = "Mouse is moving  at "+me.getX()+","+me.getY();
          repaint();
     }
     public void mouseDragged(MouseEvent me)
     {
          msg="Mouse is being dragged at "+me.getX()+","+me.getY();
          repaint();
     } 
 }