  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="MouseAdapterInnerApplet.class" width=500 height=500>
 </applet>
*/
  public class MouseAdapterInnerApplet extends Applet
  {
     String msg="";
     public void init()
     {
         msg="Mouse Events Testing Applet";
         addMouseListener(new MyAdapter());
     }
     public void paint(Graphics g)
     {
        g.drawString(msg,50,200);    
     }
    class MyAdapter extends MouseAdapter   //inner class
    {
      public void mouseClicked(MouseEvent me) 
      {         
          msg = "Mouse button "+me.getButton() +" is clicked  at "+me.getX()+","+me.getY();
          repaint();
      } 
   }     //end of inner class
 }  //end of outer class
