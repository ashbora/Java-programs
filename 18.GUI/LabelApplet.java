 import java.awt.*;
 import java.applet.*;
 /*
 <applet code="LabelApplet.class" width=500 height=500>
 </applet>
 */
public class LabelApplet extends Applet
{
   public void init()
   {
        Label l1 = new Label();
        Label l2 = new Label("Java GUI Programming");
        Label l3 = new Label("Applet tester",Label.RIGHT);
        add(l1);
        add(l2);
        add(l3); 
   }
}
