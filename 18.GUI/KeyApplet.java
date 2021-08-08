  import java.applet.*;
  import java.awt.*;
  import java.awt.event.*;
 /*
 <applet code="KeyApplet.class" width=500 height=500>
 </applet>
*/
  public class KeyApplet extends Applet implements KeyListener
  {
     String msg1="";
     String msg2=""; 
    public void init()
     {
         msg1="Key Events Testing Applet";
         addKeyListener(this);
     }
     public void paint(Graphics g)
     {
        g.drawString(msg1,50,200);    
        g.drawString(msg2,50,300);    
     }
     public void keyPressed(KeyEvent ke) 
     {         
          msg1 = "Key pressed "+ ke.getKeyCode();
          repaint();
     }
     public void keyReleased(KeyEvent ke)
     {
          msg1="Key released "+ke.getKeyCode();
          repaint();
     }
     public void keyTyped(KeyEvent ke)
     {
          msg2=msg2+ke.getKeyChar();
          repaint();
     }  
 }