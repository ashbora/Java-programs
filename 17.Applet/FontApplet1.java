 import java.awt.*;
 import java.applet.*;
/*
<applet code="FontApplet1.class" width=500 height=500>
</applet>
*/
public class FontApplet1 extends Applet
{
    List lstfonts;
    public void init()
    {
         GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
         lstfonts = new List(20);
         add(lstfonts);
         String [] avl_fonts = ge.getAvailableFontFamilyNames();
         for(int i=0;i<avl_fonts.length;i++)
            lstfonts.add(avl_fonts[i]);
    }
}
