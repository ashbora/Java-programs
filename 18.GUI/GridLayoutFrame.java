 import java.awt.*;
 import java.awt.event.*;
 class GridLayoutFrame extends Frame
 {
      GridLayoutFrame()
      {
          setTitle("Flow Layout testing");
          setSize(500,600);
          addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
         GridLayout gl = new GridLayout(4,3,50,100);
         setLayout(gl);
         for(int i=1;i<=10;i++)
          {
              Button b = new Button("Button "+i);
              add(b);
          }
      }

     public static void main(String [] args)
    {
        (new GridLayoutFrame()).setVisible(true);
    }
 }