 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
 <applet code="CheckApplet2.class" width=500 height=500>
 </applet>
*/
public class CheckApplet2 extends Applet implements ItemListener
{
     Checkbox c1,c2,c3,c4;
     CheckboxGroup cbg;
     public void init()
     {
         cbg = new CheckboxGroup();
         c1 = new Checkbox("Windows 7",cbg,false);
         add(c1);
         c1.addItemListener(this);
         c2 = new Checkbox("Windows 8",cbg,false);
         add(c2);
         c2.addItemListener(this);
         c3 = new Checkbox("Solaris",cbg,false);
         add(c3);
         c3.addItemListener(this);
         c4 = new Checkbox("Linux",false,cbg);
         add(c4);
         c4.addItemListener(this);
     }
     public void paint(Graphics g)
     {
       if(cbg.getSelectedCheckbox()!=null)
        {   String msg = "Selected option :"+ cbg.getSelectedCheckbox().getLabel(); 
             g.drawString(msg,100,100);
        }
     }
     public void itemStateChanged(ItemEvent ie)
     {
          repaint();   
     }
}