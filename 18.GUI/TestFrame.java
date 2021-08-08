 import java.awt.*;
 import java.awt.event.*;
 class MyFrame extends Frame
 {
       MyFrame()
       {
            setTitle("My First Frame Window");
           // setSize(500,500);
           setExtendedState(Frame.MAXIMIZED_BOTH);
           addWindowListener(new WindowAdapter(){public void windowClosing                                  (WindowEvent we){ System.exit(0); }});

       }
 }

class TestFrame
{
   public static void main(String [] args)
   {
       MyFrame fr = new MyFrame();
       fr.setVisible(true);
   }
}