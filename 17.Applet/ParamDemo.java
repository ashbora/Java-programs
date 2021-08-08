import java.applet.*;
import java.awt.*;
/*
<applet code="ParamDemo.class" width=400 height=400>
<param name="UserName" value="Amitabh Bachchan">
<param name="UserType" value="Visitor">
</applet>
*/
public class ParamDemo extends Applet
{
    String uname,utype; 
    public void init()
    {
       uname = getParameter("UserName");
       utype = getParameter("UserType");
    }
   public void paint(Graphics g)
   {
        g.drawString("Username : "+uname,100,200);
        g.drawString("Type : "+utype,100,250);
   }
}