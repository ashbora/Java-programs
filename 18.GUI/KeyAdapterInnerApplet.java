  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="KeyAdapterInnerApplet.class" width=500 height=500>
 </applet>
*/
  public class KeyAdapterInnerApplet extends Applet
  {
     String msg1="";
     String msg2=""; 
    public void init()
     {
         msg1="Key Events Testing Applet";
         addKeyListener(new MyAdapter());
     }
     public void paint(Graphics g)
     {
        g.drawString(msg1,50,200);    
        g.drawString(msg2,50,300);    
     }
    class MyAdapter extends KeyAdapter
    {
       public void keyTyped(KeyEvent ke)
       {
          msg2=msg2+ke.getKeyChar();
          repaint();
       }
    }  
 }