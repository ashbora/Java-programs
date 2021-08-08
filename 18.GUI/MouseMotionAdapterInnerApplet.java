  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="MouseMotionAdapterInnerApplet.class" width=500 height=500>
 </applet>
*/
  public class MouseMotionAdapterInnerApplet extends Applet
  {
     String msg="";
     public void init()
     {
         msg="Mouse Events Testing Applet";
         addMouseMotionListener(new MyAdapter());
     }
     public void paint(Graphics g)
     {
        g.drawString(msg,50,200);    
     }
    class MyAdapter extends MouseMotionAdapter
    {
      public void mouseDragged(MouseEvent me)
       {
          msg="Mouse is being dragged at "+me.getX()+","+me.getY();
          repaint();
       }
    } 
 }