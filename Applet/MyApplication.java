import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener
{
   MyFrame()
   {
      setSize(400,400);
      setTitle("My First GUI Application");
      setBackground(Color.red);
      addWindowListener(this);
   }
   public void windowDeactivated(WindowEvent we){}
   public void windowActivated(WindowEvent we){}
   public void windowIconified(WindowEvent we){}
   public void windowDeiconified(WindowEvent we){}
   public void windowOpened(WindowEvent we){}
   public void windowClosed(WindowEvent we){}
   public void windowClosing(WindowEvent we){ System.exit(0);}
}

class MyApplication
{
  public static void main(String [] args)
  {
       MyFrame mf = new MyFrame();
       mf.setVisible(true);
  }
}