import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener,MouseListener,MouseMotionListener
{
   String msg ="";
   MyFrame()
   {
      setSize(400,400);
      setTitle("My First GUI Application");
      setBackground(Color.red);
      setForeground(Color.yellow);
      addWindowListener(this);
      addMouseListener(this);
      addMouseMotionListener(this);
      msg = "Application started";
   }
   public void paint(Graphics g)
   {
      g.drawString(msg,50,200);
   }
   public void windowDeactivated(WindowEvent we){}
   public void windowActivated(WindowEvent we){}
   public void windowIconified(WindowEvent we){}
   public void windowDeiconified(WindowEvent we){}
   public void windowOpened(WindowEvent we){}
   public void windowClosed(WindowEvent we){}
   public void windowClosing(WindowEvent we){ System.exit(0);}
 
   public void mouseClicked(MouseEvent me)
   {
      msg = "Mouse button clicked : "+me.getButton()+" at "+me.getX()+","+me.getY();
      repaint();
   }
   public void mouseEntered(MouseEvent me)
   {
      msg = "Mouse entered in the application window";
      repaint();
   }
   public void mouseExited(MouseEvent me)
   {
      msg = "Mouse exited out of the application window";
      repaint();
   }
   public void mousePressed(MouseEvent me)
   {
      msg = "Mouse button is pressed";
      repaint();
  }
   public void mouseReleased(MouseEvent me)
  {
       msg = "Mouse button is released";
       repaint();
  }
  public void mouseMoved(MouseEvent me)
  {
      msg = "Mouse moving at "+me.getX()+","+me.getY();
      repaint();
  }
  public void mouseDragged(MouseEvent me)
  {
      msg = "Mouse being dragged at "+me.getX()+","+me.getY()+" with button "+me.getButton();
      repaint();
  }
}

class MyApplication1
{
  public static void main(String [] args)
  {
       MyFrame mf = new MyFrame();
       mf.setVisible(true);
  }
}