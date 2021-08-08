import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
 <applet code="DrawApplet.class" width="800" height="600">
 </applet>
*/ 
public class DrawApplet extends Applet implements MouseListener,MouseMotionListener
{
  int x,y;
  boolean draw;
  public void start()
  { x=0;y=0;
    draw=false;
    addMouseListener(this);
    addMouseMotionListener(this);
  } 
  public void mouseClicked(MouseEvent me){}
  public void mousePressed(MouseEvent me)
  {
    if(me.getButton()==1)
     { 
        draw=true;
        x = me.getX();
        y = me.getY();                 
     }
  }
  public void mouseReleased(MouseEvent me)
  {
     draw=false;
  }
  public void mouseEntered(MouseEvent me){}
  public void mouseExited(MouseEvent me){}
  public void mouseMoved(MouseEvent me){}
  public void mouseDragged(MouseEvent me)
  {
     if(draw)
     {
       int thisx=me.getX();
       int thisy=me.getY();
       Graphics g = this.getGraphics();
       g.setColor(Color.black);
       g.drawLine(x,y,thisx,thisy); 
       x=thisx;
       y=thisy;
     }
  }
}