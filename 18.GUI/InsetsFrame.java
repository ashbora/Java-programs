 import java.awt.*;
 import java.awt.event.*;
 class InsetsFrame extends Frame
 {
       InsetsFrame()
       {
            setSize(600,600);
            setTitle("Insets test");
            addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
          Button b1,b2,b3,b4;
          b1 = new Button("First");
          b2 = new Button("Second");
          b3 = new Button("Third");
          b4 = new Button("Fourth");
         add(b1,BorderLayout.SOUTH);
         add(b2,BorderLayout.WEST);
         add(b3,BorderLayout.NORTH);
         add(b4,BorderLayout.EAST);      
       }
       public Insets getInsets()
      {
         Insets ins = new Insets(70,30,30,30);
         return ins;  
      }
      public static void main(String [] args)
      {
            (new InsetsFrame()).setVisible(true);
      }
 }