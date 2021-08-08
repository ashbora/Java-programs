 import java.applet.*;
 import java.awt.*;
 import java.awt.event.*;
 /*
 <applet code="ButtonApplet.class" width=500 height=500> 
 </applet>
 */
 public class ButtonApplet extends Applet implements ActionListener
 {
   Button btn;
   Color [] mycolors={Color.red,Color.green,Color.yellow,Color.blue,Color.pink,Color.orange,Color.cyan};
   int cur=0;
   public void init()
   {
         btn = new Button("Click Here");
         add(btn);  
         btn.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {        
      setBackground(mycolors[cur]);
      cur++;
      if(cur>=mycolors.length)
           cur=0;
   }
 }