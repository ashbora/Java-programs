  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="MouseAdapterApplet.class" width=500 height=500>
 </applet>
*/
  public class MouseAdapterApplet extends Applet
  {
     String msg="";
     public void init()
     {
         msg="Mouse Events Testing Applet";
         addMouseListener(new MyAdapter(this));
     }
     public void paint(Graphics g)
     {
        g.drawString(msg,50,200);    
     } 
 }
  class MyAdapter extends MouseAdapter
  {
      MouseAdapterApplet obj;
       MyAdapter(MouseAdapterApplet obj)
       {
          this.obj = obj;
       }
      public void mouseClicked(MouseEvent me) 
      {         
          obj.msg = "Mouse button "+me.getButton() +" is clicked  at "+me.getX()+","+me.getY();
          obj.repaint();
      } 
 }