enum WebBrowsers
{IE,FireFox,Chrome,Safari,Opera}

class EnumDemo2
{
  public static void main(String args[])
  { 
      WebBrowsers [] wb = WebBrowsers.values();
      for(WebBrowsers v : wb)
         System.out.println(v);
  }
}