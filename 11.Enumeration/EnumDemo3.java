  enum WebBrowsers
  {IE,FireFox,Chrome,Safari,Opera}

 class EnumDemo3
 {
  public static void main(String args[])
  { 
      WebBrowsers [] wb = WebBrowsers.values();
      for(WebBrowsers v : wb)
      {
          switch(v)
          {
               case IE :  System.out.println("Internet Explorer created by MicroSoft");
                               break;
               case FireFox :  System.out.println("FireFox created by Mozilla");
                               break;
               case Chrome :  System.out.println("Chrome created by Google");
                               break;
               case Safari:  System.out.println("Safari created by Apple Corp.");
                               break;
               case Opera :  System.out.println("Opera created by Opera Corporation");
                               break;
           }
      }
  }
}