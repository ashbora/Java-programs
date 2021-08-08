import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
   MyFrame()
   {
      setSize(400,400);
      setTitle("My First GUI Application");
      setBackground(Color.red);
      addWindowListener(new MyAdapter());
   }
   
  
}

class MyAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 { System.exit(0);} 

}
class MyApplication2
{
  public static void main(String [] args)
  {
       MyFrame mf = new MyFrame();
       mf.setVisible(true);
  }
}