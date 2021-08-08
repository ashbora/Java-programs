import java.applet.*;
import java.awt.*;
import java.net.*;
/*
<applet code="ImageDemo.class" width=500 height=500>
<param name="image" value="247756.jpg">
</applet>
*/
public class ImageDemo extends Applet
{
  private Image image;
  private AppletContext context;
  public void init()
  {
      context = this.getAppletContext();
      String imageURL = this.getParameter("image");
      if(imageURL == null)
      {
         imageURL = "java.jpg";
      } 
     try
      {
         URL url = new URL(this.getDocumentBase(), imageURL);
         image = context.getImage(url);
      }catch(MalformedURLException e)
      {
         e.printStackTrace();
         showStatus("Could not load image!");
      }
   }
   public void paint(Graphics g)
   {
      showStatus("Displaying image");
      g.drawImage(image, 0, 0, 400, 400, null);
   }  
}
