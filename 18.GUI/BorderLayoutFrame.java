 import java.awt.*;
 import java.awt.event.*;
 class BorderLayoutFrame extends Frame
 {
       BorderLayoutFrame()
       {
             setSize(600,600);
             setTitle("Border layout test");
            addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
         BorderLayout bl = new BorderLayout(30,30);
         setLayout(bl);
          Button b1,b2,b3,b4,b5;
          b1 = new Button("First");
          b2 = new Button("Second");
          b3 = new Button("Third");
          b4 = new Button("Fourth");
          b5 =  new Button("Fifth");
          Panel p = new Panel();
          p.setLayout(new GridLayout());
          p.add(b1);
          p.add(b5); 
         add(p,BorderLayout.SOUTH);
         add(b2,BorderLayout.WEST);
         add(b3,BorderLayout.NORTH);
         add(b4,BorderLayout.EAST);      
         String txt ="Testing the border layout";
         TextArea ta = new TextArea(txt);
         add(ta,BorderLayout.CENTER);
       }
      public static void main(String [] args)
      {
            (new BorderLayoutFrame()).setVisible(true);
      }
 }