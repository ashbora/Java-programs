 import java.awt.*;
 import java.applet.*;
/*
 <applet code="TextAreaApplet.class" width=500 height=500>
 </applet>
*/
public class TextAreaApplet extends Applet
{
     TextArea ta;
     public void init()
     {   
            String txt = "Java is a popular programming language.";
            txt=txt+"It was developed around year 1995.";
            txt=txt+"It the popular for its capabilities of programming in Internet, Network and desktop development.";
            txt=txt+"It is equally capable for the programs development for micro-devices used now-a-days.";
            ta = new TextArea(txt,15,40,TextArea.SCROLLBARS_NONE);
            add(ta);
            ta.append("This is sufficient about Java.");
            ta.insert("It is Best of all languages available today.",39);
          //  ta.replaceRange("ABCD",0,4);
     }  
}