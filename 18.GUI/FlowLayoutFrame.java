 import java.awt.*;
 import java.awt.event.*;
 class FlowLayoutFrame extends Frame
 {
      FlowLayoutFrame()
      {
          setTitle("Flow Layout testing");
          setSize(500,600);
          addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
         FlowLayout fl = new FlowLayout(FlowLayout.CENTER,50,70);
         setLayout(fl);
         for(int i=1;i<=10;i++)
          {
              Button b = new Button("Button "+i);
              add(b);
          }
      }

     public static void main(String [] args)
    {
        (new FlowLayoutFrame()).setVisible(true);
    }
 }